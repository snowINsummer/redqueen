package redqueen.service;

import redqueen.body.fdd.CorporatorMobile;
import redqueen.body.fdd.CreditorInfo;
import redqueen.body.fdd.FddMessage;
import redqueen.body.fdd.RcBorrowGuarantor;

public interface FddService {
    Object getSignatoryMessage(FddMessage fddMessage);

    Object queryBorrowGuarantor(RcBorrowGuarantor rcBorrowGuarantor);

    Object queryCorporatorMobile(CorporatorMobile corporatorMobile);

    Object queryCreditorInfo(CreditorInfo creditorInfo);
}
