package redqueen.mapper.CompanyRegister;

import redqueen.entity.CompanyRegister.ApproInfoCenterVo;

import java.util.List;

public interface CompanyRegisterMapper {


    List<ApproInfoCenterVo> queryApproInfoCenter(String mobile);

}
