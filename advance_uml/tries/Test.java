public class Test {
    public static void main(String[] args) {
        System.out.println("Start test");

        CompactDisk myCd = new CompactDisk();
        Mouse myMouse = new Mouse();

        PersonalComputer myPC = new PersonalComputer();
        myPC.installOS();
        myPC.detectMouse(myMouse);
        myPC.readData(myCd);

        System.out.println("Test finished");
    }
}