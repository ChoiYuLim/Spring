package tvSpeaker3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        TV samsungTv = context.getBean("sT", SamsungTV.class);
        TV lgTv = context.getBean("lT", LGTV.class);
        samsungTv.turnon();
        samsungTv.volumeup();
        samsungTv.volumedown();
        samsungTv.printSpeakerBrand();
        samsungTv.turnoff();
        System.out.println("-------------------------------------");
        lgTv.turnon();
        lgTv.volumeup();
        lgTv.volumedown();
        lgTv.printSpeakerBrand();
        lgTv.turnoff();
    }
}
