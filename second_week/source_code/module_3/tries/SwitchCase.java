package module_3.tries;

public class SwitchCase {
    public static void main(String[] args) {
        char firstInitial = 'a';
        System.out.print("Masukkan huruf awal nama anda: ");

        try {
            firstInitial = (char) System.in.read();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }

        switch (firstInitial) {
            case 'a':
                System.out.println("Nama anda pasti Asep!");
            case 'b':
                System.out.println("Nama anda pasti Brodin!");
            case 'c':
                System.out.println("Nama anda pasti Cecep!");
            default:
                System.out.println("Nama anda tidak terkenal!");
        }
    }
}
