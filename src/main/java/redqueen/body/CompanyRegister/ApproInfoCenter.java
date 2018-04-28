package redqueen.body.CompanyRegister;

import org.hibernate.validator.constraints.NotBlank;

public class ApproInfoCenter {

    @NotBlank(message = "用户名不能为空！")
    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
