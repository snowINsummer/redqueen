package redqueen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qa.utils.JSONFormat;
import redqueen.body.fdd.CorporatorMobile;
import redqueen.body.fdd.CreditorInfo;
import redqueen.body.fdd.FddMessage;
import redqueen.body.fdd.RcBorrowGuarantor;
import redqueen.entity.CreditorTransfer.BorrowTenderTransferable;
import redqueen.entity.fdd.CreditorInfoVo;
import redqueen.entity.fdd.SchemeInfoBo;
import redqueen.mapper.fdd.FddMapper;
import redqueen.service.FddService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class FddServiceImpl implements FddService {

    @Autowired
    private FddMapper fddMapper;

    @Override
    public Object getSignatoryMessage(FddMessage fddMessage) {
        String sendReason = "SMS" + fddMessage.getMobile();
        return fddMapper.getSignatoryMessage(sendReason);
    }

    @Override
    public Object queryBorrowGuarantor(RcBorrowGuarantor rcBorrowGuarantor) {
        return fddMapper.queryBorrowGuarantor(rcBorrowGuarantor.getBorrowId());
    }

    @Override
    public Object queryCorporatorMobile(CorporatorMobile corporatorMobile) {
        return fddMapper.queryCorporatorMobile(corporatorMobile.getBorrowId());
    }

    @Override
    public Object queryCreditorInfo(CreditorInfo creditorInfo) {
        List<BorrowTenderTransferable> borrowTenderTransferableList =  fddMapper.queryBorrowTenderBo(creditorInfo.getBorrowId());
        List<CreditorInfoVo> list = new ArrayList<CreditorInfoVo>();
        for(BorrowTenderTransferable borrowTenderTransferable : borrowTenderTransferableList){
            Character isOptimize = borrowTenderTransferable.getIsOptimize();
            if (isOptimize.toString().equals("0")){
                continue;
            }
            List<String> jsonList = new ArrayList<String>();
            String json1 = JSONFormat.getObjectToJson(borrowTenderTransferable);
            jsonList.add(json1);
            String schemeId = borrowTenderTransferable.getSchemeId();
            Long userId = borrowTenderTransferable.getCuruserId();
            if (null != schemeId && !schemeId.isEmpty()){
                SchemeInfoBo schemeInfoBo = fddMapper.querySchemeInfo(isOptimize.toString(),schemeId,userId);
                String json2 = JSONFormat.getObjectToJson(schemeInfoBo);
                jsonList.add(json2);
            }
            String allJson = JSONFormat.getJsonAllFromJson(jsonList);
            CreditorInfoVo creditorInfoVo = JSONFormat.fromJson(allJson, CreditorInfoVo.class);
            list.add(creditorInfoVo);
        }
        return list;
    }


}
