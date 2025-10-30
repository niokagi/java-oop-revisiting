package advance_uml.practices;

public class Car {
    private Engine engine;
    private Wheel[] wheels;
    private Audio audio;

    public Car() {
        this.engine = new Engine();
        System.out.println("Car created with an engine.");
    }

    public void replaceWheel(Wheel[] wheels) {
        this.wheels = wheels;
        System.out.println("Wheels installed/replaced. Count: " + wheels.length);
    }

    public void instalAudio(Audio audio) {
        this.audio = audio;
        System.out.println("Audio system installed.");
    }

    public void playMusic(UsbFlash usb) {
        System.out.print("Car playing music... ");
        usb.readData();
    }
}
