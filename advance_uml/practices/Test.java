package advance_uml.practices;

public class Test {

    public static void main(String[] args) {

        Car myCar = new Car();

        Wheel[] carWheels = { new Wheel(), new Wheel(), new Wheel(), new Wheel() };
        Audio carAudio = new Audio();

        myCar.replaceWheel(carWheels);
        myCar.instalAudio(carAudio);

        UsbFlash myMusic = new UsbFlash();

        myCar.playMusic(myMusic);
    }
}
