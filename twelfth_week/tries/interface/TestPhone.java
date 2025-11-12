public class TestPhone {
    public static void main(String[] args) {
        SmartPhone hp = new SmartPhone("087755588990");
        System.out.println("phone number: " + hp.phoneNumber);

        System.out.println("\nchecking the call function");
        hp.call();
        hp.receiveCall();
        System.out.println("\nchecking image capturing function");
        hp.captureImage();
        System.out.println("\nchecking memory reader function");
        hp.readCard();
    }
}
