package redqueen.mapper.fdd;

import org.apache.ibatis.annotations.Mapper;
import redqueen.entity.fdd.SignatoryMessage;

import java.util.List;

@Mapper
public interface FddMapper {

    List<SignatoryMessage> getSignatoryMessage(String sendReason);

}
