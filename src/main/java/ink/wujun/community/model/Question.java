package ink.wujun.community.model;

import lombok.Data;

/**
 * @author WuJun
 * @date 2023/2/9 10:27
 */
@Data
public class Question {
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
}
