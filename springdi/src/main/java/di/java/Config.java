package di.java;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"di.java"})
@Configuration // 설정 관련된 파일이다!
public class Config {
    //
    // @Qualifier("mycar")
    // @Bean
    // public Car car() {
    // return new Car();
    // }
    //
    // @Qualifier("h1")
    // @Bean
    // public HankookTire hankookTire() {
    // return new HankookTire();
    // }
    //
    // @Qualifier("k")
    // @Bean
    // public KumhoTire kumhoTire() {
    // return new KumhoTire();
    // }
}
