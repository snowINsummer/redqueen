package redqueen.service;

import redqueen.body.CreditorMatching.TradePack;
import redqueen.body.CreditorTransfer.TradeRequest;

public interface CreditorMatchingService {
    Object queryTradePack(TradePack tradePack);

    Object queryTradeRequest(TradeRequest tradeRequest);

    Object queryAccountLog(TradePack tradePack);
}
