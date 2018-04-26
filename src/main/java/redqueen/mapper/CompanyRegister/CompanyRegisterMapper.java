package redqueen.mapper.CompanyRegister;

import org.apache.ibatis.annotations.Param;
import redqueen.entity.CompanyRegister.ApproInfoCenterVo;
import redqueen.entity.CompanyRegister.FkComtomerInfoVo;

import java.util.List;

public interface CompanyRegisterMapper {


    List<ApproInfoCenterVo> queryApproInfoCenter(String mobile);

    List<FkComtomerInfoVo> queryFkComtomerInfo(@Param("userName")String userName, @Param("borrowId")String borrowId);
}
