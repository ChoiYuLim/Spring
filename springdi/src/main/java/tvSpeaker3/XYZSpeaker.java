package tvSpeaker3;

import org.springframework.stereotype.Component;

@Component("xyzS")
public class XYZSpeaker implements Speaker {

    public void volumeup() {
        System.out.println("XYZ Speaker 스피커 볼륨업");
    }

    public void volumedown() {
        System.out.println("XYZ Speaker 스피커 볼륨업");
    }

    public String getBrand() {
        return "XYZ";
    }

}
