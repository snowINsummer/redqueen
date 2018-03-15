package redqueen.mapper.CreditorTransfer;

import org.apache.ibatis.annotations.Param;
import redqueen.entity.CreditorExit.AccountLogVo;

import java.util.List;

public interface CreditorExitMapper {

    List<AccountLogVo> queryAccountLog(@Param("schemeId")String schemeId,
                                       @Param("salerMobile")String salerMobile,
                                       @Param("tenderId")String tenderId);

}
