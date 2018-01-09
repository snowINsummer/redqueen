package redqueen.mapper.CreditorTransfer;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import redqueen.entity.CreditorTransfer.BorrowTenderTransferable;

import java.util.List;

@Mapper
public interface CreditorTransferMapper {

    List<BorrowTenderTransferable> getCreditorRights(@Param("mobile") String mobile, @Param("schemeId") String schemeId, @Param("isOptimize") String isOptimize);

}
