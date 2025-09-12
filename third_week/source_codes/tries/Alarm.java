public class Alarm {
    public String id;
    public String description;
    public String date;
    public String time;

    public Alarm(String id, String description, String date, String time) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.time = time;
    }

    public void run() {
        System.out.println("ALARM ON!");
        System.out.println("ID: " + this.id + " (" + this.description + ")");
        System.out.println("Waktu: " + this.time + ", Date: " + this.date);
        System.out.println("BEEP... BEEP... BEEP...!");
    }

    public void terminate() {
        System.out.println("> Alarm '" + this.description + "' telah dimatikan.");
    }

    public void snooze() {
        System.out.println("> Alarm '" + this.description + "' ditunda selama 5 menit.");
    }
}