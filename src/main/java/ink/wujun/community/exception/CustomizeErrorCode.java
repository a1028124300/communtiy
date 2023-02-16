package ink.wujun.community.exception;

/**
 * @author WuJun
 * @date 2023/2/16 10:43
 */
public enum  CustomizeErrorCode implements ICustomizeErrorCode {
    QUESTION_NOT_FOUND("你找的问题不在了，要不要换个试试？");

    private String message;

    CustomizeErrorCode(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }
}