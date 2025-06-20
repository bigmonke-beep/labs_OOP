package Lab_8.Task5;

public class Task5 {
    public void turnOn() {
        System.out.println("Device is turning on...");
    }
}

class Phone extends Task5 {
    public void makeCall() {
        System.out.println("Making a phone call...");
    }
}

class Tablet extends Task5 {
    public void watchVideo() {
        System.out.println("Watching a video...");
    }
}

class SmartPhone extends Phone {
    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("SmartPhone is booting up...");
    }

    public void browseInternet() {
        System.out.println("Browsing the internet...");
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.turnOn();
        phone.makeCall();

        Tablet tablet = new Tablet();
        tablet.turnOn();
        tablet.watchVideo();

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.turnOn();
        smartPhone.makeCall();
        smartPhone.browseInternet();
    }
}
