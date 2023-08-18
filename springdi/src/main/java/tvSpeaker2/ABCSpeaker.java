package tvSpeaker2;

public class ABCSpeaker implements Speaker {

    public void volumeup() {
        System.out.println("ABCSpeaker 스피커 볼륨업");
    }

    public void volumedown() {
        System.out.println("ABCSpeaker 스피커 볼륨다운");
    }

    public String getBrand() {
        return "ABC";
    }
}

