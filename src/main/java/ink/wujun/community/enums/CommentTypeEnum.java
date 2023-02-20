package ink.wujun.community.enums;

/**
 * @author WuJun
 * @date 2023/2/19 10:28
 */
public enum CommentTypeEnum {
    QUESTION(1),
    COMMENT(2);
    private Integer tpye;

    public static boolean isExist(Integer type) {
        for (CommentTypeEnum commentTypeEnum : CommentTypeEnum.values()) {
            if(commentTypeEnum.getTpye() == type){
                return true;
            }
        }
        return false;
    }

    public Integer getTpye() {
        return tpye;
    }

    CommentTypeEnum(Integer tpye) {
        this.tpye = tpye;
    }}
