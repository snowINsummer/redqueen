package redqueen.entity.CreditorMatching;

import java.math.BigDecimal;

public class TradeRequestBVo {

    private String requestId;
    private String tenderId;
    private String addTime;
    private Long status;
    private BigDecimal amount;
    private BigDecimal btAmount;

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

    public BigDecimal getBtAmount() {
        return btAmount;
    }

    public void setBtAmount(BigDecimal btAmount) {
        this.btAmount = btAmount;
    }
}
