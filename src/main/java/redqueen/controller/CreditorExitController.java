package redqueen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import qa.utils.JSONFormat;
import redqueen.body.CreditorExit.CreditorExit;
import redqueen.common.configuration.TargetDataSource;
import redqueen.common.constants.Constants;
import redqueen.common.entity.ReqData;
import redqueen.common.entity.RspData;
import redqueen.service.CreditorExitService;

@RestController
@RequestMapping("/creditorExit")
public class CreditorExitController {

    @Autowired
    private CreditorExitService creditorExitService;


    @TargetDataSource("stage")
    @RequestMapping(value = "/stage/queryAccountLog", method = RequestMethod.POST)
    public RspData queryAccountLogStage(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            CreditorExit creditorExit = JSONFormat.fromJson(json, CreditorExit.class);
            rspData.setData(creditorExitService.queryAccountLog(creditorExit));
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
            CreditorExit creditorExit = JSONFormat.fromJson(json, CreditorExit.class);
            rspData.setData(creditorExitService.queryAccountLog(creditorExit));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;
    }



}
