package basic.di.xml01;

import java.util.List;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("spring-xml01.xml");

        // 1. 생성자 주입
        // Car c1 = new Car(new HankookTire);
//        Car localCar = (Car) context.getBean("car3");
//        localCar.printTireBrand();

        Car car4 = (Car) context.getBean("car4");
        List<String> list = car4.getDriver();
        for (String string : list) {
            System.out.println(string);
        }
        System.out.println("자동차 수선내역 맵:");
        Car car5 = (Car) context.getBean("car5");
        Map<String, String> m = car5.getRepairMap();
        for (Map.Entry<String, String> entry : m.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
