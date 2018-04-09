package redqueen.entity.CompanyRegister;

public class ApproInfoCenterVo {

    private Long userId;
    private Long realName;
    private Long mobile;
    private Long company;
    private Long bank;
    private String createDate;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRealName() {
        return realName;
    }

    public void setRealName(Long realName) {
        this.realName = realName;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public Long getCompany() {
        return company;
    }

    public void setCompany(Long company) {
        this.company = company;
    }

    public Long getBank() {
        return bank;
    }

    public void setBank(Long bank) {
        this.bank = bank;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
