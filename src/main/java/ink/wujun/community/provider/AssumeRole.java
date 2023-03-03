package ink.wujun.community.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.sts.model.v20150401.*;

/**
 * @author WuJun
 * @date 2023/3/3 17:09
 */
@Service
public class AssumeRole {


    @Value("${aliyunOss.accessKeyId}")
    String accessKeyId;

    @Value("${aliyunOss.accessKeySecret}")
    String accessKeySecret;

    @Value("${aliyunSts.roleArn}")
    String roleArn;

    @Value("${aliyunSts.roleSessionName}")
    String roleSessionName;

    public AssumeRoleResponse getAssumeRole(){
        DefaultProfile profile = DefaultProfile.getProfile("cn-chengdu", accessKeyId, accessKeySecret);
        /** use STS Token
         DefaultProfile profile = DefaultProfile.getProfile(
         "<your-region-id>",           // The region ID
         "<your-access-key-id>",       // The AccessKey ID of the RAM account
         "<your-access-key-secret>",   // The AccessKey Secret of the RAM account
         "<your-sts-token>");          // STS Token
         **/

        IAcsClient client = new DefaultAcsClient(profile);


        AssumeRoleRequest request = new AssumeRoleRequest();
        request.setRoleArn(roleArn);
        request.setRoleSessionName(roleSessionName);

        try {
            AssumeRoleResponse response = client.getAcsResponse(request);

            return response;

        } catch (ServerException e) {
            e.printStackTrace();
            return null;
        } catch (ClientException e) {
            System.out.println("ErrCode:" + e.getErrCode());
            System.out.println("ErrMsg:" + e.getErrMsg());
            System.out.println("RequestId:" + e.getRequestId());
            return null;
        }

    }

}
