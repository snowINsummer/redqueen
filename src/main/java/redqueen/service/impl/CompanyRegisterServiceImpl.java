package redqueen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redqueen.body.CompanyRegister.ApproInfoCenter;
import redqueen.body.CompanyRegister.FkComtomerInfo;
import redqueen.mapper.CompanyRegister.CompanyRegisterMapper;
import redqueen.service.CompanyRegisterService;

@Service
public class CompanyRegisterServiceImpl implements CompanyRegisterService {

    @Autowired
    CompanyRegisterMapper companyRegisterMapper;

    @Override
    public Object queryApproInfoCenter(ApproInfoCenter approInfoCenter) {
        return companyRegisterMapper.queryApproInfoCenter(approInfoCenter.getMobile());
    }

    @Override
    public Object queryFkComtomerInfo(FkComtomerInfo fkComtomerInfo) {
        return companyRegisterMapper.queryFkComtomerInfo(fkComtomerInfo.getUserName(),fkComtomerInfo.getBorrowId());
    }


}
