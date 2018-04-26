package redqueen.service;

import redqueen.body.CompanyRegister.ApproInfoCenter;
import redqueen.body.CompanyRegister.FkComtomerInfo;

public interface CompanyRegisterService {
    Object queryApproInfoCenter(ApproInfoCenter approInfoCenter);

    Object queryFkComtomerInfo(FkComtomerInfo fkComtomerInfo);
}
