package tvSpeaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sT")
public class SamsungTV implements TV {

    Speaker leftspeaker;
    Speaker rightspeaker;

    @Autowired
    public SamsungTV(@Qualifier("xyzS") Speaker leftspeaker,
            @Qualifier("xyzS") Speaker rightspeaker) {
        this.leftspeaker = leftspeaker;
        this.rightspeaker = rightspeaker;
    }

    public void turnon() {
        System.out.println("삼성tv 켜짐");
    }

    public void turnoff() {
        System.out.println("삼성tv 꺼짐");

    }

    public void volumeup() {
        System.out.println("삼성tv 볼륨업");
        leftspeaker.volumeup();
        rightspeaker.volumeup();
    }

    public void volumedown() {
        System.out.println("삼성tv 볼륨다운");
        leftspeaker.volumedown();
        rightspeaker.volumedown();
    }

    public void printSpeakerBrand() {
        System.out.println("leftspeaker Brand is " + leftspeaker.getBrand()
                + " and rightspeaker Brand is " + rightspeaker.getBrand());
    }
}
