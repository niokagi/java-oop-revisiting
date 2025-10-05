public class TestLogin {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa fadilah = new Mahasiswa();
        fadilah.setUsername("fadilah");
        fadilah.setPassword("123456");
        fadilah.setPhone("083853501388");
        fadilah.setKelas("IF-45-01");

        // Memanggil method login dari User (versi phone)
        boolean resultMahasiswa = fadilah.login("083853501388", "123456", true);
        System.out.println(
                resultMahasiswa ? "Login Mahasiswa berhasil" : "Login Mahasiswa gagal");
        fadilah.displayInfo(); // Menunjukkan hasil overriding

        System.out.println("\n===========================\n");

        // Membuat objek Dosen
        Dosen fahrul = new Dosen();
        fahrul.setUsername("fahrul");
        fahrul.setPassword("123456");
        fahrul.setKey("19990129");
        fahrul.setPangkat("Lektor");
        fahrul.setGolongan("III/c");

        // Memanggil method login spesifik milik Dosen
        boolean resultDosen = fahrul.login("fahrul", "123456", "19990129");
        System.out.println(
                resultDosen ? "Login Dosen berhasil" : "Login Dosen gagal");
        fahrul.displayInfo(); // Menunjukkan hasil overriding
    }
}