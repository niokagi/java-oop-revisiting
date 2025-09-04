package module_4.tasks;

public class WordCounting {
    public static void main(String[] args) {
        char[] matKul = {
                'p', 'e', 'm', 'r', 'o', 'g', 'r', 'a', 'm', 'a', 'n',
                'b', 'e', 'r', 'b', 'a', 's', 'i', 's',
                'o', 'b', 'y', 'e', 'k'
        };

        int totalOfA = 0;
        for (int i = 0; i < matKul.length; i++) {
            if (matKul[i] == 'a') {
                System.out.println("ketemu! di index: " + i);
                totalOfA++;
            }
        }
        System.out.println();
        System.out.println("String: " + new String(matKul));
        System.out.println("Jumlah huruf A ditemukan: " + totalOfA);
    }
}
