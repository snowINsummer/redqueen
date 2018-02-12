package redqueen.mapper.CreditorTransfer;

import redqueen.entity.CreditorMatching.AccountLogVo;
import redqueen.entity.CreditorMatching.TradePackVo;
import redqueen.entity.CreditorMatching.TradeRequestBVo;

import java.util.List;

public interface CreditorMatchingMapper {

    List<TradeRequestBVo> queryTradeRequest(String tenderId);

    List<TradePackVo> queryTradePack(String requestId);

    List<AccountLogVo> queryAccountLog(String requestId);

}
