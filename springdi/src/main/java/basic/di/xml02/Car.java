package basic.di.xml02;

public class Car {

    private Tire tire;
    private Tire s_tire;

    public Tire getS_tire() {
        return s_tire;
    }

    public void setS_tire(Tire s_tire) {
        this.s_tire = s_tire;
    }

    String carName;
    int year;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car() {
        System.out.println("Car() 생성자입니다.");
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        System.out.println("setTire(tire) 입니다.");
        this.tire = tire;
    }

    public void printTireBrand() {
        System.out.println("타이어 브랜드는 " + tire.getTireBrand());
        System.out.println("스페어 타이어 브랜드는 " + s_tire.getTireBrand());
    }

    @Override
    public String toString() {
        return "Car [tire=" + tire + ", s_tire=" + s_tire + ", carName=" + carName + ", year="
                + year + "]";
    }

}
