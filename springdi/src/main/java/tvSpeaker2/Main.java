package tvSpeaker2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("tvSpeakerAnnotation02.xml");
        TV tv = context.getBean("lT", LGTV.class);
        tv.turnon();
        tv.volumeup();
        tv.volumedown();
        tv.printSpeakerBrand();
        tv.turnoff();
    }
}
