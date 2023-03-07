package ink.wujun.community.dto;

import lombok.Data;

/**
 * @author WuJun
 * @date 2023/3/7 12:28
 */
@Data
public class QuestionQueryDTO {
    private String search;
    private Integer page;
    private Integer size;

}
