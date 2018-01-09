package redqueen.mapper;

import org.apache.ibatis.annotations.Mapper;
import redqueen.entity.User;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getAll(String mobile);

}