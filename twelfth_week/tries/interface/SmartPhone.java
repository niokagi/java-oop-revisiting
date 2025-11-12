public class SmartPhone extends Phone implements Camera, CardReader {
    public String phoneNumber;
    public Lens lens;

    public SmartPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.lens = new Lens("Standard Lens");
    }
    // from phone
    @Override
    public void call() {
        System.out.println("calling..");
    }
    @Override
    public void receiveCall() {
        System.out.println("receiving call..");
    }
    // from camera
    @Override
    public void captureImage() {
        System.out.println("capturing image with " + this.lens.getType());
    }
    // from card reader
    @Override
    public void readCard() {
        System.out.println("read card memory...");
    }
}
