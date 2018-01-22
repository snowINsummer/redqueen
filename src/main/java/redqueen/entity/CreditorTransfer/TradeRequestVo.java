package redqueen.entity.CreditorTransfer;

import java.math.BigDecimal;
import java.util.Date;

public class TradeRequestVo {

    private String requestId;
    private String tenderId;
    private Long salerUserId;
    private String salerMobile;
    private String addTime;
    private Long status;
    private BigDecimal amount;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getTenderId() {
        return tenderId;
    }

    public void setTenderId(String tenderId) {
        this.tenderId = tenderId;
    }

    public Long getSalerUserId() {
        return salerUserId;
    }

    public void setSalerUserId(Long salerUserId) {
        this.salerUserId = salerUserId;
    }

    public String getSalerMobile() {
        return salerMobile;
    }

    public void setSalerMobile(String salerMobile) {
        this.salerMobile = salerMobile;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
