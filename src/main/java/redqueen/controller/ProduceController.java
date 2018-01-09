package redqueen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qa.utils.JSONFormat;
import redqueen.body.Borrow;
import redqueen.common.configuration.TargetDataSource;
import redqueen.common.entity.ReqData;
import redqueen.common.entity.RspData;
import redqueen.service.UserService;

@RestController
@RequestMapping("/user")
public class ProduceController {

    @Autowired
    private UserService userService;

    @TargetDataSource("test")
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public RspData getProduct(@RequestBody ReqData reqData){
        String json = JSONFormat.getObjectToJson(reqData.getData());
        Borrow borrow = JSONFormat.fromJson(json, Borrow.class);
        RspData rspData = new RspData();
        rspData.setData(userService.getAll(borrow));
        return rspData;
    }

    @TargetDataSource("stage")
    @RequestMapping(value = "/stage", method = RequestMethod.POST)
    public RspData getAllProduct(@RequestBody ReqData reqData){
        String json = JSONFormat.getObjectToJson(reqData.getData());
        Borrow borrow = JSONFormat.fromJson(json, Borrow.class);
        RspData rspData = new RspData();
        rspData.setData(userService.getAll(borrow));
        return rspData;
    }

}
