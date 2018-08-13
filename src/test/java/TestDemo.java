import com.junit.TestAdd;
import org.junit.Assert;
import org.junit.Test;

public class TestDemo {
    @Test
    public void testAdd() {
        TestAdd testAdd = new TestAdd();
        int a = 1;
        int b = 2;
        int c = a + b;
        Assert.assertEquals(testAdd.testAdd(a, b), c);
    }


}
