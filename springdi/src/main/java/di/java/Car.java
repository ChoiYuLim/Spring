package di.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    @Qualifier("h1")
    private Tire tire;

    public Car() {
        System.out.println("car() 의 생성자입니다.");
    }

    // 생성자에서는 인자앞에 넣어라
    @Autowired
    public Car(@Qualifier("h1") Tire t) {
        this.tire = t;
        System.out.println("car(Tire t)의 생성자입니다.");
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        System.out.println("setTire(Tire t)의 생성자입니다.");
        this.tire = tire;
    }

    public void printTireBrand() {
        System.out.println("타이어 브랜드는  " + tire.getTireBrand());
    }

}
