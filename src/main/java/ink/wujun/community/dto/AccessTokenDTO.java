package ink.wujun.community.dto;

import lombok.Data;

/**
 * @author WuJun
 * @date 2023/2/2 21:10
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;


}
