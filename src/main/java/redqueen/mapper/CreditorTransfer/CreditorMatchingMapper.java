package redqueen.mapper.CreditorTransfer;

import redqueen.entity.CreditorTransfer.TradePackVo;

import java.util.List;

public interface CreditorMatchingMapper {

    List<TradePackVo> queryTradePack(String requestId);

}
