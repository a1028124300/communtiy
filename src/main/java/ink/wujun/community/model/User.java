package ink.wujun.community.model;

import lombok.Data;

/**
 * @author WuJun
 * @date 2023/2/8 13:06
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
