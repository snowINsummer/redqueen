package redqueen.entity.fdd;

public class CorporatorMobileVo {

    private String corporatorName;
    private String corporatorMobile;
    private Long status;
    private String companyName;

    public String getCorporatorName() {
        return corporatorName;
    }

    public void setCorporatorName(String corporatorName) {
        this.corporatorName = corporatorName;
    }

    public String getCorporatorMobile() {
        return corporatorMobile;
    }

    public void setCorporatorMobile(String corporatorMobile) {
        this.corporatorMobile = corporatorMobile;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
