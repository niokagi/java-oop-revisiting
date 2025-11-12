package practices.p_1;

public class Gun extends Weapon {
    private int bullets;

    public Gun(int bullets) {
        this.bullets = bullets;
    }

    @Override
    public void attack() {
        if (this.bullets > 0) {
            System.out.println("Menembakkan peluru");
            this.bullets--;
            System.out.println("Sisa peluru:" + this.bullets);
        } else {
            System.out.println("Peluru habis...");
        }
    }
}
