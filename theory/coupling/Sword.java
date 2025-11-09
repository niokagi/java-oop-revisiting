public class Sword implements IWeapon {
    @Override
    public String attack() {
        String message = "Swing the Sword!";
        System.out.println(message);
        return message;
    }
}
