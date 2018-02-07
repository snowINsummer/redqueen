package redqueen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import qa.utils.JSONFormat;
import redqueen.body.fdd.CorporatorMobile;
import redqueen.body.fdd.CreditorInfo;
import redqueen.body.fdd.FddMessage;
import redqueen.body.fdd.RcBorrowGuarantor;
import redqueen.common.configuration.TargetDataSource;
import redqueen.common.constants.Constants;
import redqueen.common.entity.ReqData;
import redqueen.common.entity.RspData;
import redqueen.service.FddService;

@RestController
@RequestMapping("/fdd")
public class FddController {

    @Autowired
    private FddService fddService;

    @TargetDataSource("stage")
    @RequestMapping(value = "/stage/getSignatoryMessage", method = RequestMethod.POST)
    public RspData getSignatoryMessage(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            FddMessage fddMessage = JSONFormat.fromJson(json, FddMessage.class);
            rspData.setData(fddService.getSignatoryMessage(fddMessage));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }

    @TargetDataSource("stage")
    @RequestMapping(value = "/stage/queryBorrowGuarantor", method = RequestMethod.POST)
    public RspData queryBorrowGuarantor(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            RcBorrowGuarantor rcBorrowGuarantor = JSONFormat.fromJson(json, RcBorrowGuarantor.class);
            rspData.setData(fddService.queryBorrowGuarantor(rcBorrowGuarantor));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }

    @TargetDataSource("stage")
    @RequestMapping(value = "/stage/queryCorporatorMobile", method = RequestMethod.POST)
    public RspData queryCorporatorMobile(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            CorporatorMobile corporatorMobile = JSONFormat.fromJson(json, CorporatorMobile.class);
            rspData.setData(fddService.queryCorporatorMobile(corporatorMobile));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }

    @TargetDataSource("stage")
    @RequestMapping(value = "/stage/queryCreditorInfo", method = RequestMethod.POST)
    public RspData queryCreditorInfo(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            CreditorInfo creditorInfo = JSONFormat.fromJson(json, CreditorInfo.class);
            rspData.setData(fddService.queryCreditorInfo(creditorInfo));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }
}
