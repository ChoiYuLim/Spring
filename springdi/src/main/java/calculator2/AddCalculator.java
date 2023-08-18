package calculator2;

import org.springframework.stereotype.Component;

@Component("addC")
public class AddCalculator implements Calculator {
    public int calculate(int n1, int n2) {
        return n1 + n2;
    }

    public String getSign() {
        return "+";
    }
}
