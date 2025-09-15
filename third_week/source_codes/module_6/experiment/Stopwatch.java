package third_week.source_codes.module_6.experiment;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Stopwatch {
    static int interval;
    static Timer timer;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input seconds => : ");
            String secs = sc.nextLine();
            int delay = 1000;
            int period = 1000;
            timer = new Timer();
            interval = Integer.parseInt(secs);
            
            System.out.println(secs);
            timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    System.out.println(setInterval());

                }
            }, delay, period);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static final int setInterval() {
        if (interval == 1)
            timer.cancel();
        return --interval;
    }
}
