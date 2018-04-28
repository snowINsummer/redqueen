package redqueen.body.CreditorMatching;

import org.hibernate.validator.constraints.NotBlank;

public class TradePack {

    @NotBlank(message = "requestId不能为空！")
    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
