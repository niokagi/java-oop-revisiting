package module_5.tasks;

public class Task_5 {
    public static void main(String[] args) {
        String kalimatUtama = "Praktikum di laboratorium Database";
        String kataYangDiganti = "Database";
        String kataPengganti = "Sistem Informasi";

        System.out.println("Input:");
        System.out.println("String kalimat utama : " + kalimatUtama);
        System.out.println("String yang diganti  : " + kataYangDiganti);
        System.out.println("String pengganti     : " + kataPengganti);
        System.out.println("-----------------------------------------------------");

        String kalimatHasil = kalimatUtama.replace(kataYangDiganti, kataPengganti);

        System.out.println("Output:");
        System.out.println("Kalimat utama menjadi: " + kalimatHasil);

        System.out.println("\n--- Contoh Lain ---");
        String contohLain = "Saya benci programming! Saya sangat benci!";
        String hasilLain = contohLain.replace("benci", "suka");
        System.out.println("Kalimat asli: " + contohLain);
        System.out.println("Hasil ganti : " + hasilLain);
    }
}
