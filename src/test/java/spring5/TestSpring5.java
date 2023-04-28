package spring5;

import com.agg.spring5.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-04-27 15:56
 * Version 1.0
 */
public class TestSpring5 {
    @Test
    public void testAdd() {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        context.getMessage("hi",null, Locale.CHINA);
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

}
