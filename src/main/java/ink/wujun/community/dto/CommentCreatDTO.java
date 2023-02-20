package ink.wujun.community.dto;

import lombok.Data;

/**
 * @author WuJun
 * @date 2023/2/19 9:51
 */
@Data
public class CommentCreatDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
