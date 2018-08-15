package user.service;

import user.dao.DaoFactory;
import user.dao.UserDaoImpl;
import user.domain.User;

public class UserService {

    private UserDaoImpl userDao = DaoFactory.getUserDao();

    public void register(User user) throws UserException {
        /*
          1. 使用用户名去查询，如果返回null，完成添加
          2. 如果返回的不是null，抛出异常
         */
        User _user = userDao.findByUsername(user.getUsername());
        if (_user != null) throw new UserException("username: " + user.getUsername() + ", is registered");
        userDao.add(user);
    }


}
