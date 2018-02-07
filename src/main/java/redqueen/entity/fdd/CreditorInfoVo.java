package redqueen.entity.fdd;

import java.math.BigDecimal;

public class CreditorInfoVo {

    private String tenderId;
    private String borrowId;
    private String joinId;
    private String joinDate;
    private String schemeId;
    private String schemeName;
    private Long curuserId;
    private String curuserMobile;
    private String isOptimize;
    private Long status;
    private BigDecimal effectiveMoney;

    public String getTenderId() {
        return tenderId;
    }

    public void setTenderId(String tenderId) {
        this.tenderId = tenderId;
    }

    public String getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(String borrowId) {
        this.borrowId = borrowId;
    }

    public String getJoinId() {
        return joinId;
    }

    public void setJoinId(String joinId) {
        this.joinId = joinId;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(String schemeId) {
        this.schemeId = schemeId;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public Long getCuruserId() {
        return curuserId;
    }

    public void setCuruserId(Long curuserId) {
        this.curuserId = curuserId;
    }

    public String getCuruserMobile() {
        return curuserMobile;
    }

    public void setCuruserMobile(String curuserMobile) {
        this.curuserMobile = curuserMobile;
    }

    public String getIsOptimize() {
        return isOptimize;
    }

    public void setIsOptimize(String isOptimize) {
        this.isOptimize = isOptimize;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public BigDecimal getEffectiveMoney() {
        return effectiveMoney;
    }

    public void setEffectiveMoney(BigDecimal effectiveMoney) {
        this.effectiveMoney = effectiveMoney;
    }
}
