package redqueen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redqueen.body.Borrow;
import redqueen.entity.User;
import redqueen.mapper.UserMapper;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * Get product by id
     * If not found product will throw ServiceException
     *
     * @return
     * @param borrow
     */
    public List<User> getAll(Borrow borrow) {
        List<User> product = userMapper.getAll(borrow.getMobile());
        return product;
    }

}
