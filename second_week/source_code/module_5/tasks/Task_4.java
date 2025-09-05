package module_5.tasks;

public class Task_4 {
    public static void main(String[] args) {
        String namaPertama = "Katy Perry";
        String namaKedua = "Taylor Swift";

        System.out.println("Sebelum Ditukar: ");
        System.out.println("String nama pertama : " + namaPertama);
        System.out.println("String nama kedua   : " + namaKedua);

        int posisiSpasi1 = namaPertama.lastIndexOf(' ');
        String firstName1 = namaPertama.substring(0, posisiSpasi1);
        String familyName1 = namaPertama.substring(posisiSpasi1 + 1);

        int posisiSpasi2 = namaKedua.lastIndexOf(' ');
        String firstName2 = namaKedua.substring(0, posisiSpasi2);
        String familyName2 = namaKedua.substring(posisiSpasi2 + 1);

        String hasilNamaPertama = firstName1 + " " + familyName2;
        String hasilNamaKedua = firstName2 + " " + familyName1;

        System.out.println("\nSetelah Ditukar:");
        System.out.println("String nama pertama : " + hasilNamaPertama);
        System.out.println("String nama kedua   : " + hasilNamaKedua);
    }

    public static void tukarDanTampilkan(String nama1, String nama2) {
        System.out.println("Sebelum: " + nama1 + " & " + nama2);

        int spasi1 = nama1.lastIndexOf(' ');
        String depan1 = nama1.substring(0, spasi1);
        String belakang1 = nama1.substring(spasi1 + 1);

        int spasi2 = nama2.lastIndexOf(' ');
        String depan2 = nama2.substring(0, spasi2);
        String belakang2 = nama2.substring(spasi2 + 1);

        System.out.println("Sesudah: " + (depan1 + " " + belakang2) + " & " + (depan2 + " " + belakang1));
    }
}
