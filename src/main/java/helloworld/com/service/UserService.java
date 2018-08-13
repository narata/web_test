package helloworld.com.service;

import helloworld.com.dao.UserDao;
import helloworld.com.domain.User;

public class UserService {
    private UserDao userDao = new UserDao();

    public User find() {
        return userDao.find();
    }

}
