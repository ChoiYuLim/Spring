package di.anno04;
import org.springframework.stereotype.Component;

@Component
public class KumhoTire implements Tire {
    
    public String getTireBrand() {
        return "금호 타이어";
    }
}
