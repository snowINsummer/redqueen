package redqueen.body.CreditorTransfer;

import org.hibernate.validator.constraints.NotBlank;

public class TradeRequest {

    @NotBlank(message = "tenderId不能为空！")
    private String tenderId;

    public String getTenderId() {
        return tenderId;
    }

    public void setTenderId(String tenderId) {
        this.tenderId = tenderId;
    }
}
