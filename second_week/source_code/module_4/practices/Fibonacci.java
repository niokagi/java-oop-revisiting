package module_4.practices;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n1 = 0, n2 = 1;

        System.out.print("Masukkan jumlah deretan Fibonacci? ");
        int jumlahDeret = input.nextInt();

        System.out.println("Hasil deret Fibonacci:");

        for (int i = 1; i <= jumlahDeret; i++) {
            System.out.print(n1 + "  ");
            long sukuBerikutnya = n1 + n2;

            n1 = n2;
            n2 = sukuBerikutnya;
        }

        System.out.println(); 
        input.close();
    }
}
