package redqueen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import qa.utils.JSONFormat;
import qa.utils.ValidationUtil;
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
    public RspData getSignatoryMessageStage(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            FddMessage fddMessage = JSONFormat.fromJson(json, FddMessage.class);
            ValidationUtil.validate(fddMessage);
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
    public RspData queryBorrowGuarantorStage(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            RcBorrowGuarantor rcBorrowGuarantor = JSONFormat.fromJson(json, RcBorrowGuarantor.class);
            ValidationUtil.validate(rcBorrowGuarantor);
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
    public RspData queryCorporatorMobileStage(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            CorporatorMobile corporatorMobile = JSONFormat.fromJson(json, CorporatorMobile.class);
            ValidationUtil.validate(corporatorMobile);
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
    public RspData queryCreditorInfoStage(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            CreditorInfo creditorInfo = JSONFormat.fromJson(json, CreditorInfo.class);
            ValidationUtil.validate(creditorInfo);
            rspData.setData(fddService.queryCreditorInfo(creditorInfo));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }

    @TargetDataSource("test")
    @RequestMapping(value = "/test/getSignatoryMessage", method = RequestMethod.POST)
    public RspData getSignatoryMessageTest(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            FddMessage fddMessage = JSONFormat.fromJson(json, FddMessage.class);
            ValidationUtil.validate(fddMessage);
            rspData.setData(fddService.getSignatoryMessage(fddMessage));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }

    @TargetDataSource("test")
    @RequestMapping(value = "/test/queryBorrowGuarantor", method = RequestMethod.POST)
    public RspData queryBorrowGuarantorTest(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            RcBorrowGuarantor rcBorrowGuarantor = JSONFormat.fromJson(json, RcBorrowGuarantor.class);
            ValidationUtil.validate(rcBorrowGuarantor);
            rspData.setData(fddService.queryBorrowGuarantor(rcBorrowGuarantor));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }

    @TargetDataSource("test")
    @RequestMapping(value = "/test/queryCorporatorMobile", method = RequestMethod.POST)
    public RspData queryCorporatorMobileTest(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            CorporatorMobile corporatorMobile = JSONFormat.fromJson(json, CorporatorMobile.class);
            ValidationUtil.validate(corporatorMobile);
            rspData.setData(fddService.queryCorporatorMobile(corporatorMobile));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }

    @TargetDataSource("test")
    @RequestMapping(value = "/test/queryCreditorInfo", method = RequestMethod.POST)
    public RspData queryCreditorInfoTest(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            CreditorInfo creditorInfo = JSONFormat.fromJson(json, CreditorInfo.class);
            ValidationUtil.validate(creditorInfo);
            rspData.setData(fddService.queryCreditorInfo(creditorInfo));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }
}
