package third_week.source_codes.module_6.tasks;
// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mahasiswa nio = new Mahasiswa("Niokagi", "1012022001");
        MataKuliah kalkulus = new MataKuliah("KALK01", "Kalkulus", 3, "Dr. A.");

        System.out.println(nio.printDataDiri());
        nio.setIpk(3.5);

        boolean bisaAmbilMK = new RegistStudi(nio, kalkulus)
                .validasiRegistrasi(nio.getIpk(), kalkulus.getSks());

        if (bisaAmbilMK) {
            // regis
            RegistStudi regNio = new RegistStudi(nio, kalkulus);
            // nio.belajar();
            // regNio.inputNilai('B');
            // result
            regNio.displayInfo();
        } else {
            System.out.println("\nRegistrasi tidak memenuhi syarat.");
        }
    }
}
