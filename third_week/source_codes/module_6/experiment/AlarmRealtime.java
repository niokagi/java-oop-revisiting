package third_week.source_codes.module_6.experiment;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class AlarmRealtime {
    public String id;
    public String desc;
    public String date; 
    public String time;

    public AlarmRealtime(String id, String desc, String date, String time) {
        this.id = id;
        this.desc = desc;
        this.date = date;
        this.time = time;
    }

    public void run() {
        String dateTimeString = this.date + " " + this.time;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime alarmTargetTime;

        try {
            alarmTargetTime = LocalDateTime.parse(dateTimeString, formatter);
        } catch (DateTimeParseException e) {
            System.err.println("Format tanggal/waktu salah!, Gunakan format 'yyyy-MM-dd' dan 'HH:mm:ss'.");
            return;
        }

        if (alarmTargetTime.isBefore(LocalDateTime.now())) {
            System.out.println("Alarm untuk '" + desc + "' sudah lewat waktunya.");
            return;
        }

        System.out.println("Alarm '" + this.desc + "' disetel untuk " + dateTimeString);

        while (LocalDateTime.now().isBefore(alarmTargetTime)) {
            try {
                Duration remaining = Duration.between(LocalDateTime.now(), alarmTargetTime);
                long totalSeconds = remaining.toSeconds() + 1;
                long days = remaining.toDays();
                long hours = remaining.toHoursPart();
                long minutes = remaining.toMinutesPart();
                long seconds = remaining.toSecondsPart() + 1;

                String countdownText = String.format("Sisa waktu: %d hari, %02d:%02d:%02d", days, hours, minutes,
                        seconds);
                System.out.print(countdownText + "\r");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Countdown diinterupsi.");
            }
        }

        System.out.println("\n========================================");
        System.out.println("WAKTU HABIS! ALARM BERBUNYI!");
        System.out.println("   ID: " + this.id + " (" + this.desc + ")");
        System.out.println("========================================");
    }

    public void terminate() {
        System.out.println("Alarm '" + this.desc + "' telah dimatikan.");
    }

    public void snooze() {
        System.out.println("Alarm '" + this.desc + "' ditunda selama 5 menit.");
    }
}