package jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.beans.PropertyVetoException;
import java.sql.*;

public class Demo1 {
    @Test
    public void fun1() throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC  ";
            String username = "root";
            String password = "narata";
            con = DriverManager.getConnection(url, username, password);
            statement = con.createStatement();
            resultSet = statement.executeQuery("select * from first");
            resultSet.next();
            System.out.println(resultSet.getInt("id"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (null != resultSet) resultSet.close();
            if (null != statement) statement.close();
            if (null != con) con.close();
        }
    }

    @Test
    public void c2p01() throws PropertyVetoException, SQLException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
//        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test?serverTimezone=UTC");
//        dataSource.setUser("root");
//        dataSource.setPassword("narata");
        Connection con = dataSource.getConnection();
        System.out.println(con);
        con.close();

    }
}
