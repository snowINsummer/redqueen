package redqueen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import qa.utils.JSONFormat;
import redqueen.body.CompanyRegister.ApproInfoCenter;
import redqueen.body.CompanyRegister.FkComtomerInfo;
import redqueen.body.CreditorExit.CreditorExit;
import redqueen.common.configuration.TargetDataSource;
import redqueen.common.constants.Constants;
import redqueen.common.entity.ReqData;
import redqueen.common.entity.RspData;
import redqueen.service.CompanyRegisterService;

@RestController
@RequestMapping("/companyRegister")
public class CompanyRegisterController {

    @Autowired
    private CompanyRegisterService companyRegisterService;

    @TargetDataSource("stage")
    @RequestMapping(value = "/stage/queryApproInfoCenter", method = RequestMethod.POST)
    public RspData queryAccountLogStage(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            ApproInfoCenter approInfoCenter = JSONFormat.fromJson(json, ApproInfoCenter.class);
            rspData.setData(companyRegisterService.queryApproInfoCenter(approInfoCenter));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }

    @TargetDataSource("test")
    @RequestMapping(value = "/test/queryApproInfoCenter", method = RequestMethod.POST)
    public RspData queryAccountLogTest(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            ApproInfoCenter approInfoCenter = JSONFormat.fromJson(json, ApproInfoCenter.class);
            rspData.setData(companyRegisterService.queryApproInfoCenter(approInfoCenter));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }

    @TargetDataSource("stage")
    @RequestMapping(value = "/stage/queryFkComtomerInfo", method = RequestMethod.POST)
    public RspData queryFkComtomerInfoStage(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            FkComtomerInfo fkComtomerInfo = JSONFormat.fromJson(json, FkComtomerInfo.class);
            rspData.setData(companyRegisterService.queryFkComtomerInfo(fkComtomerInfo));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }

    @TargetDataSource("test")
    @RequestMapping(value = "/test/queryFkComtomerInfo", method = RequestMethod.POST)
    public RspData queryFkComtomerInfoTest(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            FkComtomerInfo fkComtomerInfo = JSONFormat.fromJson(json, FkComtomerInfo.class);
            rspData.setData(companyRegisterService.queryFkComtomerInfo(fkComtomerInfo));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }


}
