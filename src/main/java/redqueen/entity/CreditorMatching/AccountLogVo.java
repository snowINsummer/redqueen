package redqueen.entity.CreditorMatching;

import java.math.BigDecimal;

public class AccountLogVo {

    private String description;
    private String operatorType;
    private BigDecimal alWorkMoney;
    private BigDecimal trAmount;
    private Long alUserId;
    private Long trUserId;
    private Long tpUserId;
    private String pCode;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }

    public BigDecimal getAlWorkMoney() {
        return alWorkMoney;
    }

    public void setAlWorkMoney(BigDecimal alWorkMoney) {
        this.alWorkMoney = alWorkMoney;
    }

    public BigDecimal getTrAmount() {
        return trAmount;
    }

    public void setTrAmount(BigDecimal trAmount) {
        this.trAmount = trAmount;
    }

    public Long getAlUserId() {
        return alUserId;
    }

    public void setAlUserId(Long alUserId) {
        this.alUserId = alUserId;
    }

    public Long getTrUserId() {
        return trUserId;
    }

    public void setTrUserId(Long trUserId) {
        this.trUserId = trUserId;
    }

    public Long getTpUserId() {
        return tpUserId;
    }

    public void setTpUserId(Long tpUserId) {
        this.tpUserId = tpUserId;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }
}
