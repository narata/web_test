package thread;

import org.junit.Test;

public class Demo1 {
    @Test
    public void fun1() {
        ThreadLocal<String> tl = new ThreadLocal<>();
        tl.set("hello");
        System.out.println(tl.get());
        tl.remove();
    }

    @Test
    public void fun2() {

    }
}
