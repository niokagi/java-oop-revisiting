public class AlarmTester {
    public static void main(String[] args) {
        Alarm pagi = new Alarm("al-1", "wake up morn", "13-Sep-2025", "6 PM");
        pagi.run();

        System.out.println();
        pagi.terminate();
    }
}
