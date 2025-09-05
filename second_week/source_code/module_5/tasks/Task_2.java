package module_5.tasks;

public class Task_2 {
    public static void main(String[] args) {
        String kalimat = "Selamat Datang di PENS";

        System.out.println("String asli: \"" + kalimat + "\"");
        System.out.println();
        
        String hurufKapital = kalimat.toUpperCase();
        System.out.println("a. Hasil UPPERCASE : " + hurufKapital);

        String hurufKecil = kalimat.toLowerCase();
        System.out.println("b. Hasil lowercase  : " + hurufKecil);

        int panjang = kalimat.length();
        System.out.println("c. Panjang string  : " + panjang + " karakter");

        int indeks = kalimat.indexOf("PENS");
        System.out.println("d. Indeks kata 'PENS' dimulai dari: " + indeks);
    }
}
