package module_5.tasks;

public class Task_3 {
    public static void main(String[] args) {
        String masukan = "Amanda Ace";
        System.out.println("String masukan : " + masukan);

        String hasil = tukarUjungKarakter(masukan);
        System.out.println("String hasil   : " + hasil);

        String masukan2 = "Pemrograman";
        System.out.println("String masukan : " + masukan2);
        System.out.println("String hasil   : " + tukarUjungKarakter(masukan2));

        String masukan3 = "Java";
        System.out.println("String masukan : " + masukan3);
        System.out.println("String hasil   : " + tukarUjungKarakter(masukan3));
    }

    public static String tukarUjungKarakter(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }

        char hurufPertama = str.charAt(0);
        char hurufTerakhir = str.charAt(str.length() - 1);
        String bagianTengah = str.substring(1, str.length() - 1);

        return hurufTerakhir + bagianTengah + hurufPertama;
    }
}
