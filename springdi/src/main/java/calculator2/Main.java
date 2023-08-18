package calculator2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MyCalculator c = context.getBean("myAddC", MyCalculator.class);
        MyCalculator2 c2 = context.getBean("myMulC", MyCalculator2.class);
        c.printResult();
        c2.printResult();
    }
}
