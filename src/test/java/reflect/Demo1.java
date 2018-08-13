package reflect;

import org.junit.Test;

import java.lang.reflect.Method;

public class Demo1 {
    @Test
    public void demo1() throws Exception {
        Class cl = Class.forName("reflect.Person");
        Person person = (Person) cl.newInstance();
        Method method = cl.getDeclaredMethod("setName", String.class);
        method.invoke(person, "Narata");
        System.out.println(person.toString());
        
    }

}
