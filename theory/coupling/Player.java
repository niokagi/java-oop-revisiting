public class Player {
    private IWeapon weapon;
    private String name;

    public Player(String name, IWeapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void performAttack() {
        String attackResult = this.weapon.attack();
        System.out.println(this.name + " performed action: " + attackResult);
    }

    public String getName() {
        return this.name;
    }
}
