package redqueen.entity.fdd;

public class SignatoryMessage {

    private Long rowNum;
    private Long userId;
    private String sendReason;
    private String context;
    private String sendTime;

    public Long getRowNum() {
        return rowNum;
    }

    public void setRowNum(Long rowNum) {
        this.rowNum = rowNum;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getSendReason() {
        return sendReason;
    }

    public void setSendReason(String sendReason) {
        this.sendReason = sendReason;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }
}
