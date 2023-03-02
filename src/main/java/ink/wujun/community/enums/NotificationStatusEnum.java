package ink.wujun.community.enums;

/**
 * @author WuJun
 * @date 2023/3/2 10:38
 */
public enum  NotificationStatusEnum {
    UNREAD(0),
    READ(1)
    ;
    private int status;

    NotificationStatusEnum(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
