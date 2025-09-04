package module_4.tries;

public class Array1 {
    public static void main(String[] args) {
        int nilai[] = new int[3];
        nilai[0] = 70;
        nilai[1] = 80;
        nilai[2] = 65;

        double rataRata = 0.0;
        for (int i = 0; i < nilai.length; i++) {
            rataRata += nilai[i];
        }

        rataRata /= nilai.length;
        System.out.println("Nilai rata-rata: " + rataRata);
    }
}
