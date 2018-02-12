package redqueen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redqueen.body.CreditorMatching.TradePack;
import redqueen.body.CreditorTransfer.TradeRequest;
import redqueen.mapper.CreditorTransfer.CreditorMatchingMapper;
import redqueen.service.CreditorMatchingService;

@Service
public class CreditorMatchingServiceImpl implements CreditorMatchingService {

    @Autowired
    CreditorMatchingMapper creditorMatchingMapper;

    @Override
    public Object queryTradePack(TradePack tradePack) {
        return creditorMatchingMapper.queryTradePack(tradePack.getRequestId());
    }

    @Override
    public Object queryTradeRequest(TradeRequest tradeRequest) {
        return creditorMatchingMapper.queryTradeRequest(tradeRequest.getTenderId());
    }
}
