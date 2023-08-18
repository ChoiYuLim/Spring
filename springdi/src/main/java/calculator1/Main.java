package calculator1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("calculatorAnnotation01.xml");
        MyCalculator c = context.getBean("myAddC", MyCalculator.class);
        MyCalculator2 c2 = context.getBean("myMulC", MyCalculator2.class);
        c.printResult();
        c2.printResult();
    }
}
