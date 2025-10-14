class KpopFans extends Fans {
    public KpopFans() {
        super();
    }

    public KpopFans(String name) {
        super(name);
    }

    public void watchingPerformances(Musician musician, String expression) {
        System.out.print(this.getName() + ": " + expression + " melihat idolanya");
        musician.perform();
        System.out.println();
    }
}