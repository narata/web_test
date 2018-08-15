import com.junit.TestAdd;
import org.junit.Assert;
import org.junit.Test;
import user.dao.DaoFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestDemo {
    @Test
    public void testAdd() {
        TestAdd testAdd = new TestAdd();
        int a = 1;
        int b = 2;
        int c = a + b;
        Assert.assertEquals(testAdd.testAdd(a, b), c);
    }

    @Test
    public void demo1() throws IOException {
        InputStream in = DaoFactory.class.getClassLoader().getResourceAsStream("dao.properties");
        Properties props = new Properties();
        props.load(in);
        String daoClassName = props.getProperty("user.dao.UserDao");
        System.out.println(daoClassName);
    }


}
