package redqueen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redqueen.body.CreditorExit.CreditorExit;
import redqueen.mapper.CreditorTransfer.CreditorExitMapper;
import redqueen.service.CreditorExitService;

@Service
public class CreditorExitServiceImpl implements CreditorExitService {

    @Autowired
    CreditorExitMapper creditorExitMapper;

    @Override
    public Object queryAccountLog(CreditorExit creditorExit) {
        String schemeId = creditorExit.getSchemeId();
        String salerMobile = creditorExit.getSalerMobile();
        String tenderId = creditorExit.getTenderId();
        return creditorExitMapper.queryAccountLog(schemeId,salerMobile,tenderId);
    }
}
