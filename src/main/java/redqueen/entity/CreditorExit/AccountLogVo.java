package redqueen.entity.CreditorExit;

import java.math.BigDecimal;

public class AccountLogVo {

    private String pCode;
    private BigDecimal alWorkmoney;
    private BigDecimal userWorkmoney;
    private Long salerUserId;
    private Long curUserId;
    private String addTime;

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public BigDecimal getAlWorkmoney() {
        return alWorkmoney;
    }

    public void setAlWorkmoney(BigDecimal alWorkmoney) {
        this.alWorkmoney = alWorkmoney;
    }

    public BigDecimal getUserWorkmoney() {
        return userWorkmoney;
    }

    public void setUserWorkmoney(BigDecimal userWorkmoney) {
        this.userWorkmoney = userWorkmoney;
    }

    public Long getSalerUserId() {
        return salerUserId;
    }

    public void setSalerUserId(Long salerUserId) {
        this.salerUserId = salerUserId;
    }

    public Long getCurUserId() {
        return curUserId;
    }

    public void setCurUserId(Long curUserId) {
        this.curUserId = curUserId;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }
}
