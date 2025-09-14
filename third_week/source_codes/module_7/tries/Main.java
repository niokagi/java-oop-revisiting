package third_week.source_codes.module_7.tries;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime targetTime = LocalDateTime.now().plusMinutes(1);
        String targetDateString = targetTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String targetTimeString = targetTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        System.out.println("Alarm 'Presentasi Project' Dibuat...");
        AlarmRealtime projectAlarm = new AlarmRealtime(
                "P007",
                "Presentasi Project",
                targetDateString,
                targetTimeString);

        projectAlarm.run();
        // projectAlarm.terminate();
        // projectAlarm.snooze();
    }
}