package tasks;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3;

        System.out.print("Masukkan berapa deret Fibonacci? : ");
        int jmlDeret = input.nextInt();

        System.out.print(jmlDeret + " deret Fibonacci = ");
        for (int i = 1; i <= jmlDeret; i++) {
            System.out.print(n2 + " ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        System.out.println();
        input.close();
    }
}
