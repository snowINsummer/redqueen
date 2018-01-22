package redqueen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redqueen.body.CreditorTransfer.BorrowTender;
import redqueen.body.CreditorTransfer.TradeRequest;
import redqueen.mapper.CreditorTransfer.CreditorTransferMapper;
import redqueen.service.CreditorTransferService;

@Service
public class CreditorTransferServiceImpl implements CreditorTransferService {

    @Autowired
    CreditorTransferMapper creditorTransferMapper;

    @Override
    public Object queryCreditorRights(BorrowTender borrowTender) {
        String mobile = borrowTender.getMobile();
        String schemeId = borrowTender.getSchemeId();
        String isOptimize = borrowTender.getIsOptimize();
        return creditorTransferMapper.queryCreditorRights(mobile,schemeId,isOptimize);
    }

    @Override
    public Object queryTradeRequest(TradeRequest tradeRequest) {
        return creditorTransferMapper.queryTradeRequest(tradeRequest.getTenderId());
    }


}
