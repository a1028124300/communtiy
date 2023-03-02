package ink.wujun.community.dto;

import ink.wujun.community.model.User;
import lombok.Data;

/**
 * @author WuJun
 * @date 2023/3/2 10:56
 */
@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}
