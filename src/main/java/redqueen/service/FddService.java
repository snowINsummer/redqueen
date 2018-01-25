package redqueen.service;

import redqueen.body.fdd.FddMessage;
import redqueen.body.fdd.RcBorrowGuarantor;

public interface FddService {
    Object getSignatoryMessage(FddMessage fddMessage);

    Object queryBorrowGuarantor(RcBorrowGuarantor rcBorrowGuarantor);
}
