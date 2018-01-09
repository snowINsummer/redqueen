package redqueen.entity.CreditorTransfer;

import java.math.BigDecimal;

public class BorrowTenderTransferable {

    private String tenderId;
    private String borrowId;
    private String schemeId;
    private Long curuserId;
    private String curuserMobile;
    private Character isOptimize;
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

    public String getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(String schemeId) {
        this.schemeId = schemeId;
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

    public Character getIsOptimize() {
        return isOptimize;
    }

    public void setIsOptimize(Character isOptimize) {
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
