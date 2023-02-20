package ink.wujun.community.dto;

import ink.wujun.community.model.User;
import lombok.Data;

/**
 * @author WuJun
 * @date 2023/2/20 11:14
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private String content;
    private User user;
}
