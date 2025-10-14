public class Fans {
    private String name;

    // default constructor
    public Fans() {
        this.name = "noname";
    }

    public Fans(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("Nama Fan: " + this.name);
    }

    public String getName(){
        return this.name;
    }

    public void watchingPerformances() {
        System.out.println(this.name + ": melihat idolanya dari youtube");
    }

    public void watchingPerformances(Musician musician) {
        System.out.print(this.name + ": melihat idolanya");
        musician.perform();
        System.out.println();
    }
}
