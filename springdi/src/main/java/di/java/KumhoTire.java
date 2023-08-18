package di.java;
import org.springframework.stereotype.Component;

@Component("kumhoTire")
public class KumhoTire implements Tire {
    
    public String getTireBrand() {
        return "금호 타이어";
    }
}
