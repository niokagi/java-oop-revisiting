public class PersonalComputer {
    public MotherBoard motherBoard;
    public OperatingSystem os; 
    public Mouse mouse; 

    public PersonalComputer() {
        this.motherBoard = new MotherBoard();
        System.out.println("PersonalComputer created.");
    }

    public void installOS() {
        this.os = new OperatingSystem();
        System.out.println("OperatingSystem installed.");
    }

    public void readData(CompactDisk cd) {
        System.out.print("PC reading data... ");
        cd.read(); 
    }

    public void detectMouse(Mouse mouse) {
        this.mouse = mouse;
        System.out.println("Mouse detected and assigned.");
    }
}