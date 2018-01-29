package redqueen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redqueen.body.fdd.CorporatorMobile;
import redqueen.body.fdd.FddMessage;
import redqueen.body.fdd.RcBorrowGuarantor;
import redqueen.mapper.fdd.FddMapper;
import redqueen.service.FddService;

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


}
