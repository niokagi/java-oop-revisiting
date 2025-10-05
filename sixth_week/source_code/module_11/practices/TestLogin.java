public class TestLogin {
    public static void main(String[] args) {
        Mahasiswa fadilah = new Mahasiswa();
        fadilah.setUsername("fadilah");
        fadilah.setPassword("123456");
        fadilah.setPhone("083853501388");
        fadilah.setKelas("IF-45-01");

        boolean resultMahasiswa = fadilah.login("083853501388", "123456", true);
        System.out.println(
                resultMahasiswa ? "Login Mahasiswa berhasil" : "Login Mahasiswa gagal");
        fadilah.displayInfo();

        System.out.println("\n===========================\n");

        Dosen fahrul = new Dosen();
        fahrul.setUsername("fahrul");
        fahrul.setPassword("123456");
        fahrul.setKey("19990129");
        fahrul.setPangkat("Lektor");
        fahrul.setGolongan("III/c");

        boolean resultDosen = fahrul.login("fahrul", "123456", "19990129");
        System.out.println(
                resultDosen ? "Login Dosen berhasil" : "Login Dosen gagal");
        fahrul.displayInfo();
    }
}