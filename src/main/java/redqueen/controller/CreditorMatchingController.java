package redqueen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import qa.utils.JSONFormat;
import qa.utils.ValidationUtil;
import redqueen.body.CreditorMatching.TradePack;
import redqueen.body.CreditorTransfer.TradeRequest;
import redqueen.common.configuration.TargetDataSource;
import redqueen.common.constants.Constants;
import redqueen.common.entity.ReqData;
import redqueen.common.entity.RspData;
import redqueen.service.CreditorMatchingService;

@RestController
@RequestMapping("/creditorMatching")
public class CreditorMatchingController {


    @Autowired
    private CreditorMatchingService creditorMatchingService;

    @TargetDataSource("stage")
    @RequestMapping(value = "/stage/queryTradePack", method = RequestMethod.POST)
    public RspData queryCreditorRightsStage(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            TradePack tradePack = JSONFormat.fromJson(json, TradePack.class);
            ValidationUtil.validate(tradePack);
            rspData.setData(creditorMatchingService.queryTradePack(tradePack));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }

    @TargetDataSource("test")
    @RequestMapping(value = "/test/queryTradePack", method = RequestMethod.POST)
    public RspData queryCreditorRightsTest(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            TradePack tradePack = JSONFormat.fromJson(json, TradePack.class);
            ValidationUtil.validate(tradePack);
            rspData.setData(creditorMatchingService.queryTradePack(tradePack));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }

    @TargetDataSource("stage")
    @RequestMapping(value = "/stage/queryTradeRequest", method = RequestMethod.POST)
    public RspData queryTradeRequestStage(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            TradeRequest tradeRequest = JSONFormat.fromJson(json, TradeRequest.class);
            ValidationUtil.validate(tradeRequest);
            rspData.setData(creditorMatchingService.queryTradeRequest(tradeRequest));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }

    @TargetDataSource("test")
    @RequestMapping(value = "/test/queryTradeRequest", method = RequestMethod.POST)
    public RspData queryTradeRequestTest(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            TradeRequest tradeRequest = JSONFormat.fromJson(json, TradeRequest.class);
            ValidationUtil.validate(tradeRequest);
            rspData.setData(creditorMatchingService.queryTradeRequest(tradeRequest));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }

    @TargetDataSource("stage")
    @RequestMapping(value = "/stage/queryAccountLog", method = RequestMethod.POST)
    public RspData queryAccountLogStage(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            TradePack tradePack = JSONFormat.fromJson(json, TradePack.class);
            ValidationUtil.validate(tradePack);
            rspData.setData(creditorMatchingService.queryAccountLog(tradePack));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }

    @TargetDataSource("test")
    @RequestMapping(value = "/test/queryAccountLog", method = RequestMethod.POST)
    public RspData queryAccountLogTest(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            TradePack tradePack = JSONFormat.fromJson(json, TradePack.class);
            ValidationUtil.validate(tradePack);
            rspData.setData(creditorMatchingService.queryAccountLog(tradePack));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }
}
