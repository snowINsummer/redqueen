package redqueen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import qa.utils.JSONFormat;
import qa.utils.ValidationUtil;
import redqueen.body.CreditorTransfer.BorrowTender;
import redqueen.body.CreditorTransfer.TradeRequest;
import redqueen.common.configuration.TargetDataSource;
import redqueen.common.constants.Constants;
import redqueen.common.entity.ReqData;
import redqueen.common.entity.RspData;
import redqueen.service.CreditorTransferService;

@RestController
@RequestMapping("/creditorTransfer")
public class CreditorTransferController {

    @Autowired
    private CreditorTransferService creditorTransferService;

    @TargetDataSource("stage")
    @RequestMapping(value = "/stage/queryCreditorRights", method = RequestMethod.POST)
    public RspData queryCreditorRightsStage(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            BorrowTender borrowTender = JSONFormat.fromJson(json, BorrowTender.class);
            rspData.setData(creditorTransferService.queryCreditorRights(borrowTender));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }

    @TargetDataSource("test")
    @RequestMapping(value = "/test/queryCreditorRights", method = RequestMethod.POST)
    public RspData queryCreditorRightsTest(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            BorrowTender borrowTender = JSONFormat.fromJson(json, BorrowTender.class);
            rspData.setData(creditorTransferService.queryCreditorRights(borrowTender));
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
            rspData.setData(creditorTransferService.queryTradeRequest(tradeRequest));
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
            rspData.setData(creditorTransferService.queryTradeRequest(tradeRequest));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }

}
