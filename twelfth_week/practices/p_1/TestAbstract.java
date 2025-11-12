package practices.p_1;

public class TestAbstract {
    public static void main(String[] args) {
        // Weapon weapon = new Knife(); 
        // (dihapus karena tidak terpakai)
        Weapon knife = new Knife();
        Weapon gun = new Gun(10);

        knife.attack(); 
        knife.info(); 
        gun.attack(); 
        gun.info(); 
        gun.attack(); 

        Knife knife2 = new Knife();
        Weapon gun2 = new Gun(10);

        knife2.attack(); 
        knife2.info(); 
        gun2.attack(); 
        gun2.info(); 
        gun2.attack(); 
    }
}