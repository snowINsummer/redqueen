package redqueen.body.fdd;

import org.hibernate.validator.constraints.NotBlank;

public class FddMessage {

    @NotBlank(message = "手机号不能为空！")
    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
