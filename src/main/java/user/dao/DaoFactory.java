package user.dao;

import java.io.InputStream;
import java.util.Properties;

public class DaoFactory {
    public static UserDaoImpl getUserDao() {
        try {
            InputStream in = DaoFactory.class.getClassLoader().getResourceAsStream("dao.properties");
            Properties props = new Properties();
            props.load(in);
            String daoClassName = props.getProperty("user.dao.UserDao");
            Class clazz = Class.forName(daoClassName);
            return (UserDaoImpl) clazz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
