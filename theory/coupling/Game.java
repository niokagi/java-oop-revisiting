public class Game {
    public static void main(String[] args) {
        IWeapon sword = new Sword();
        IWeapon axe = new Axe();

        Player hero = new Player("Adhim", sword);
        Player hero2 = new Player("Niokagi", axe);

        hero.performAttack();
        String heroName = hero.getName();
        System.out.println();
        hero2.performAttack();
        String hero2Name = hero2.getName();

        System.out.println("\nPlayer1 name is: " + heroName);
        System.out.println("Player2 name is: " + hero2Name);
    }
}
