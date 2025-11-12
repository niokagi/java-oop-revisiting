package practices.p_2;

public class TestPrinter {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        System.out.println("Test Printer:");
        myPrinter.printImage();
        myPrinter.copyImage();
        myPrinter.scaneImage();
    }
}