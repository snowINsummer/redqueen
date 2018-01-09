package redqueen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import qa.utils.JSONFormat;
import redqueen.body.CreditorTransfer.BorrowTender;
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
    @RequestMapping(value = "/stage/getCreditorRights", method = RequestMethod.POST)
    public RspData getCreditorRights(@RequestBody ReqData reqData){
        RspData rspData = new RspData();
        try {
            String json = JSONFormat.getObjectToJson(reqData.getData());
            BorrowTender borrowTender = JSONFormat.fromJson(json, BorrowTender.class);
            rspData.setData(creditorTransferService.getCreditorRights(borrowTender));
            rspData.setCode(Constants.CODE_SUCCESS);
        }catch (Exception e){
            rspData.setData(e.getMessage());
            e.printStackTrace();
        }
        return rspData;

    }


}
