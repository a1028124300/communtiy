package ink.wujun.community.dto;

import lombok.Data;

/**
 * @author WuJun
 * @date 2023/2/2 21:44
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}
