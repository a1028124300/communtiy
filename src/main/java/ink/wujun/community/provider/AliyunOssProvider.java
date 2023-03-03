package ink.wujun.community.provider;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;
import ink.wujun.community.exception.CustomizeErrorCode;
import ink.wujun.community.exception.CustomizeException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.UUID;

/**
 * @author WuJun
 * @date 2023/3/3 14:03
 */
@Service
public class AliyunOssProvider {

    @Value("${aliyunOss.endpoint}")
    String endpoint;

    @Value("${aliyunOss.accessKeyId}")
    String accessKeyId;

    @Value("${aliyunOss.accessKeySecret}")
    String accessKeySecret;

    @Value("${aliyunOss.bucketName}")
    String bucketName;

    public String upload(InputStream fileStream,String fileName){

        String generateFileName;
        String[] filePaths = fileName.split("\\.");
        if(filePaths.length>1){
            generateFileName = UUID.randomUUID().toString() + "."+ filePaths[filePaths.length-1];
        }else {
            return null;
        }
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        try {
            PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, generateFileName, fileStream);
            // 设置该属性可以返回response。如果不设置，则返回的response为空。
            putObjectRequest.setProcess("true");
            // 创建PutObject请求。
            PutObjectResult result = ossClient.putObject(putObjectRequest);
            // 如果上传成功，则返回200。
            if(result.getResponse().getStatusCode() == 200){
                String uri = result.getResponse().getUri();
                return uri;
            }else {
                throw new CustomizeException(CustomizeErrorCode.FILE_UPLOAD_FAIL);
            }


        } catch (OSSException oe) {
            System.out.println("Caught an OSSException, which means your request made it to OSS, "
                    + "but was rejected with an error response for some reason.");
            System.out.println("Error Message:" + oe.getErrorMessage());
            System.out.println("Error Code:" + oe.getErrorCode());
            System.out.println("Request ID:" + oe.getRequestId());
            System.out.println("Host ID:" + oe.getHostId());
            throw new CustomizeException(CustomizeErrorCode.FILE_UPLOAD_FAIL);
        } catch (ClientException ce) {
            System.out.println("Caught an ClientException, which means the client encountered "
                    + "a serious internal problem while trying to communicate with OSS, "
                    + "such as not being able to access the network.");
            System.out.println("Error Message:" + ce.getMessage());
            throw new CustomizeException(CustomizeErrorCode.FILE_UPLOAD_FAIL);
        } finally {
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }
    }
}
