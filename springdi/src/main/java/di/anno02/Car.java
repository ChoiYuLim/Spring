package di.anno02;

import javax.annotation.Resource;

public class Car {

    @Resource
    private Tire tire;

    public Car() {
        System.out.println("Car() 생성자입니다.");
    }

    public Car(Tire tire) {
        this.tire = tire;
        System.out.println("Car(Tire tire) 생성자입니다.");
    }
    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        System.out.println("setTire(Tire tire)입니다.");
        this.tire = tire;
    }

    public void printTireBrand() {
        System.out.println("타이어 브랜드는 " + tire.getTireBrand());
    }

}
