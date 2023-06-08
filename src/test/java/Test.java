import CheckFieldDemo.a_annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Test {

    /**
     * @Description 使用@a_annotation注解到User类上，使用testA将注解上的max值取出并显示
     * @throws NoSuchFieldException
     */
    @org.junit.Test
    public void testA() throws NoSuchFieldException {
        Class<User> userClass = User.class;
        Field age = userClass.getDeclaredField("age");
        a_annotation annotation = age.getAnnotation(a_annotation.class);
        System.out.println(annotation.max());

    }

}

class User {
    @a_annotation(max = 24)
    public int age;

}