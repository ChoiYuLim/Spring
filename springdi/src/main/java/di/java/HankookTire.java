package di.java;
import org.springframework.stereotype.Component;

@Component("h1")
public class HankookTire implements Tire {

    public String getTireBrand() {
        // TODO Auto-generated method stub
        return "한국 타이어";
    }

}
