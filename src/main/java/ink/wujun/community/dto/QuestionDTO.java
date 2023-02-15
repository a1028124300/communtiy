package ink.wujun.community.dto;

import ink.wujun.community.model.User;
import lombok.Data;

/**
 * @author WuJun
 * @date 2023/2/9 16:23
 */
@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
