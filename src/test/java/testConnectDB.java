import Controller.Register;
import Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class testConnectDB {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
        UserService userService = (UserService) context.getBean("userService");
        Register register = (Register) context.getBean("register");

        System.out.println(userService);
        System.out.println(jdbcTemplate);
    }
}
