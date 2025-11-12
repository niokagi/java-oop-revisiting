package tasks;

public class TestTask {
    public static void main(String[] args) {
        UsbFlash flashdisk = new UsbFlash();
        Gun handGun = new Gun();
        Ballpoint smartPen = new Ballpoint();

        System.out.println("testing flashdisk:");
        flashdisk.storeData("secret-data");

        System.out.println("\ntesting hand gun:");
        handGun.pointWithLaser();

        System.out.println("\ntesting smart-pen:");
        smartPen.draw("anime character");
        smartPen.pointWithLaser();
        smartPen.storeData("meet_voice_recording.mp3");
    }
}
