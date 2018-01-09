package redqueen.service;

import redqueen.body.CreditorTransfer.BorrowTender;

public interface CreditorTransferService {
    Object getCreditorRights(BorrowTender borrowTender);
}
