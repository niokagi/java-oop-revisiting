package module_3.trains;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long faktorial = 1L;

        System.out.print("Masukkan bilangan faktorial: ");
        int n = input.nextInt();
        System.out.println();

        System.out.printf("%-5s %15s%n", "n", "n!");
        System.out.println("-----------------------");
        
        for (int i = 1; i <= n; i++) {
            faktorial *= i;
            System.out.printf("%-5d %15d%n", i, faktorial);
        }

        System.out.println("-----------------------");
        input.close();
    }
}
