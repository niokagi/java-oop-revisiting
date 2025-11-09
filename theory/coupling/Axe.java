public class Axe implements IWeapon {
    @Override
    public String attack() {
        String message = "Swing the Axe!";
        System.out.println(message);
        return message;
    }
}
