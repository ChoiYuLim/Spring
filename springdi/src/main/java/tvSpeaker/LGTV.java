package tvSpeaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("lT")
public class LGTV implements TV {

    Speaker leftspeaker;
    Speaker rightspeaker;

    @Autowired
    public LGTV(@Qualifier("abcS") Speaker leftspeaker, @Qualifier("xyzS") Speaker rightspeaker) {
        this.leftspeaker = leftspeaker;
        this.rightspeaker = rightspeaker;
    }

    public void turnon() {
        System.out.println("LGtv 켜짐");

    }

    public void turnoff() {
        System.out.println("LGtv 꺼짐");

    }

    public void volumeup() {
        leftspeaker.volumeup();
        rightspeaker.volumeup();
    }

    public void volumedown() {
        leftspeaker.volumedown();
        rightspeaker.volumedown();
    }

    public void printSpeakerBrand() {
        System.out.println("leftspeaker Brand is " + leftspeaker.getBrand()
                + " and rightspeaker Brand is " + rightspeaker.getBrand());
    }

}
