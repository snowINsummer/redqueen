package redqueen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redqueen.body.CreditorTransfer.BorrowTender;
import redqueen.mapper.CreditorTransfer.CreditorTransferMapper;
import redqueen.service.CreditorTransferService;

@Service
public class CreditorTransferServiceImpl implements CreditorTransferService {

    @Autowired
    CreditorTransferMapper creditorTransferMapper;

    @Override
    public Object getCreditorRights(BorrowTender borrowTender) {
        String mobile = borrowTender.getMobile();
        String schemeId = borrowTender.getSchemeId();
        String isOptimize = borrowTender.getIsOptimize();
        return creditorTransferMapper.getCreditorRights(mobile,schemeId,isOptimize);
    }




}
