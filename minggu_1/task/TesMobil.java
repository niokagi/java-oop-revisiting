import java.util.ArrayList;
import java.util.List;

public class TesMobil {
    public static void main(String[] args) {
        List<Mobil> daftarMobil = new ArrayList<>();
        daftarMobil.add(new Mobil("Toyota", "Biru", "minibus", 2000, 7));
        daftarMobil.add(new Mobil("Daihatsu", "Hitam", "pick up", 1500, 2));
        daftarMobil.add(new Mobil("Suzuki", "Silver", "suv", 1800, 5));
        daftarMobil.add(new Mobil("Honda", "Merah", "sedan", 1300, 5));

        String line = "+-----+------------+----------+------------+-------------------+----------------------+";
        String header = "| No. | Merek      | Warna    | Tipe       | Kapasitas Mesin   | Kapasitas Penumpang  |";

        System.out.println(line);
        System.out.println(header);
        System.out.println(line);

        int nomor = 1;
        for (Mobil mobil : daftarMobil) {
            System.out.println(mobil.infoMobil(nomor));
            nomor++;
        }
        System.out.println(line);
    }
}
