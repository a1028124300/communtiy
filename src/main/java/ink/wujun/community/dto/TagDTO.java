package ink.wujun.community.dto;

import lombok.Data;

import java.util.List;

/**
 * @author WuJun
 * @date 2023/2/28 14:01
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
