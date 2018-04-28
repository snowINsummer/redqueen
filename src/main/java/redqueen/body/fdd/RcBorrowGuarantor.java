package redqueen.body.fdd;

import org.hibernate.validator.constraints.NotBlank;

public class RcBorrowGuarantor {

    @NotBlank(message = "标的编号不能为空！")
    private String borrowId;

    public String getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(String borrowId) {
        this.borrowId = borrowId;
    }

}
