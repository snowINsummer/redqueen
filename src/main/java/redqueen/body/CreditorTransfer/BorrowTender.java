package redqueen.body.CreditorTransfer;

public class BorrowTender {

    /**
     * 当前持有人手机号
     */
    private String mobile;
    private String schemeId;
    private String isOptimize;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(String schemeId) {
        this.schemeId = schemeId;
    }

    public String getIsOptimize() {
        return isOptimize;
    }

    public void setIsOptimize(String isOptimize) {
        this.isOptimize = isOptimize;
    }
}
