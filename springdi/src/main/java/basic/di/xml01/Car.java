package basic.di.xml01;

import java.util.List;
import java.util.Map;

public class Car {

    private Tire tire;
    private String carName;
    private int year;
    private List<String> driver;
    private Map<String, String> repairMap;

    public Map<String, String> getRepairMap() {
        return repairMap;
    }

    public void setRepairMap(Map<String, String> repairMap) {
        this.repairMap = repairMap;
    }


    public Car(Map<String, String> repairMap) {
        super();
        this.repairMap = repairMap;
    }

    public Car() {
        System.out.println("Car() 생성자입니다.");
    }

    public Car(Tire tire) {
        this.tire = tire;
        System.out.println("Car(Tire tire) 생성자입니다.");
    }

    public Car(List<String> driver) {
        this.driver = driver;
        System.out.println("List<String> driver 생성자입니다.");
    }

    public Car(String carName, int year) {
        this.carName = carName;
        this.year = year;
        System.out.println("Car(String carName, int year) 생성자입니다.");
    }

    public Car(Tire tire, String carName) {
        this.tire = tire;
        this.carName = carName;
        System.out.println("Car(Tire tire, String carName) 생성자입니다.");
    }

    public Car(Tire tire, String carName, int year) {
        super();
        this.tire = tire;
        this.carName = carName;
        this.year = year;
    }

    public List<String> getDriver() {
        return driver;
    }

    public void setDriver(List<String> driver) {
        this.driver = driver;
    }

    public void printTireBrand() {
        System.out.println("타이어 브랜드는 " + tire.getTireBrand());
    }

}
