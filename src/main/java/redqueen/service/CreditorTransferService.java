package redqueen.service;

import redqueen.body.CreditorTransfer.BorrowTender;
import redqueen.body.CreditorTransfer.TradeRequest;

public interface CreditorTransferService {
    Object queryCreditorRights(BorrowTender borrowTender);

    Object queryTradeRequest(TradeRequest tradeRequest);
}
