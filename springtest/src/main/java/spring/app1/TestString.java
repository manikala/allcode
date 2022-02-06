package spring.app1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestString {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        TestBean testBean = context.getBean("testBean", TestBean.class);

        System.out.println(testBean.getName());

        context.close();

    }
}
