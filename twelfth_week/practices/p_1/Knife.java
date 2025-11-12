package practices.p_1;

public class Knife extends Weapon {
    public String knifeEdge;

    // public Knife(String knifeEdge) {
    // this.knifeEdge = knifeEdge;
    // }

    @Override
    public void attack() {
        System.out.println("Menyayat dan menusuk musuh");
    }
}
