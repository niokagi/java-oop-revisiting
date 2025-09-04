package module_4.practices;

public class AverageGrade {
    public static void main(String[] args) {
        int[] nrp = { 1, 2, 3, 4 };
        int[][] nilai = {
                { 81, 90, 62 },
                { 50, 83, 87 },
                { 89, 55, 65 },
                { 77, 70, 92 }
        };

        System.out.printf("%-5s %s%n", "NRP", "Rata-rata");
        System.out.println("--------------------");

        for (int i = 0; i < nilai.length; i++) {
            int[] nilaiSiswa = nilai[i];

            int totalNilai = nilaiSiswa[0] + nilaiSiswa[1] + nilaiSiswa[2];
            double rataRata = (double) totalNilai / 3.0;
            System.out.printf("%-5d %.2f%n", nrp[i], rataRata);
        }

        System.out.println("--------------------");
    }
}
