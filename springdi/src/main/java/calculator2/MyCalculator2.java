package calculator2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myMulC")
public class MyCalculator2 {
    int firstNum = 10;
    int secondNum = 3;
    Calculator calculator;

    @Autowired
    public MyCalculator2(@Qualifier("mulC") Calculator calculator) {
        this.calculator = calculator;
    }

    public void printResult() {
        System.out.println(firstNum + calculator.getSign() + secondNum + "="
                + calculator.calculate(firstNum, secondNum));
    }
}
