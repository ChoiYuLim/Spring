package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {

    public static void main(String[] args) {
        // Hello h1 = new Hello();
        // h1.printHello();
        
        // 1. Spring Container 생성
        ApplicationContext context = new GenericXmlApplicationContext("basic-beanContainer.xml"); //basic-beanContainer.xml 기반으로 Spring Container를 만들겠다.
        Hello h = (Hello) context.getBean("h1");
        h.printHello();
        
        Hello hh = (Hello) context.getBean("h2");
        hh.printHello();
        
        System.out.println(h);
        System.out.println(hh);
    }
}
