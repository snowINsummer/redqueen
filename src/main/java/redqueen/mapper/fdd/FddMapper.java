package redqueen.mapper.fdd;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import redqueen.entity.CreditorTransfer.BorrowTenderTransferable;
import redqueen.entity.fdd.CorporatorMobileVo;
import redqueen.entity.fdd.RcBorrowGuarantorVo;
import redqueen.entity.fdd.SchemeInfoBo;
import redqueen.entity.fdd.SignatoryMessage;

import java.util.List;

@Mapper
public interface FddMapper {

    List<SignatoryMessage> getSignatoryMessage(String sendReason);

    List<RcBorrowGuarantorVo> queryBorrowGuarantor(String borrowId);

    List<CorporatorMobileVo> queryCorporatorMobile(String borrowId);

    List<BorrowTenderTransferable> queryBorrowTenderBo(String borrowId);

    SchemeInfoBo querySchemeInfo(@Param("schemeType") String schemeType
                                , @Param("schemeId") String schemeId
                                ,@Param("userId") Long userId);
}
