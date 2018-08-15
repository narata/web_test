package user.dao;

import org.junit.Test;
import user.domain.User;

public class UserDaoTest {

    @Test
    public void testFindByUsername() {
        UserDaoImpl userDao = new UserDaoImpl();
        User user = userDao.findByUsername("narata");
        System.out.println(user.toString());
    }

    @Test
    public void testAdd() {
        UserDaoImpl userDao = new UserDaoImpl();
        User user = new User("narata", "1234");
        System.out.println(user.toString());
        userDao.add(user);
    }
}
