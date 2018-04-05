package testapp;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import user.course.service.StudentService;

public class TestFirst {
   private  ApplicationContext ac;
   private  StudentService userService;
   @org.junit.Before
   public void before(){
	   ac=new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
	   userService=(StudentService)ac.getBean("userService");
   }
   @Test
   public void test(){
	   Integer num=userService.getCount();
	   System.out.println(num);
   }
}
