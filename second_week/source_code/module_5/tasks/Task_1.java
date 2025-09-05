package module_5.tasks;

public class Task_1 {
    public static void main(String[] args) {
        String sentence = "Politeknik Elektronika Negeri Surabaya";
        char target = 'o';

        int jumlahDitemukan = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == target) {
                jumlahDitemukan++;
            }
        }

        System.out.println("Kalimat  : \"" + sentence + "\"");
        System.out.println("Karakter : '" + target + "'");

        int[] daftarIndeks = new int[jumlahDitemukan];
        int indeksArray = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == target) {
                daftarIndeks[indeksArray] = i;
                indeksArray++;
            }
        }

        System.out.print("Output   : Karakter '" + target + "' terdapat pada indeks ");
        for (int i = 0; i < daftarIndeks.length; i++) {
            System.out.print(daftarIndeks[i]);
            if (i < daftarIndeks.length - 1) {
                System.out.print(", ");
            }
        }
	System.out.println();
    }
}
