package sixth_week.source_code.module_11.tasks;

public class TestLogin {
    public static void main(String[] args) {
        Dosen fahrul = new Dosen(
                "fahrul",
                "123456",
                "081234567890",
                "Lektor",
                "III/c",
                "19990129");

        Mahasiswa fadilah = new Mahasiswa(
                "fadilah",
                "123456",
                "083853501388",
                "IF-45-01");

        fadilah.setDosenWali(fahrul);
        boolean resultMahasiswa = fadilah.login("083853501388", "123456", true);
        System.out.println(
                resultMahasiswa ? "Login Mahasiswa berhasil" : "Login Mahasiswa gagal");
        fadilah.displayInfo();
        System.out.println("\n===========================\n");

        boolean resultDosen = fahrul.login("fahrul", "123456", "19990129");
        System.out.println(
                resultDosen ? "Login Dosen berhasil" : "Login Dosen gagal");
        fahrul.displayInfo();
    }
}
