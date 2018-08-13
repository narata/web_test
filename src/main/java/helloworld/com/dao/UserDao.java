package helloworld.com.dao;

import helloworld.com.domain.User;

public class UserDao {
    public User find() {
        return new User("narata", "123");
    }
}
