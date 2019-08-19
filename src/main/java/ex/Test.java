package ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.StudentService;
import service.impl.Lover;
public class Test {
public static void main(String[] args) {
/*Spring出场*/
ApplicationContext context =new ClassPathXmlApplicationContext("spring-config.xml");
Lover l =(Lover) context.getBean("lover");
l.Show();
}
}