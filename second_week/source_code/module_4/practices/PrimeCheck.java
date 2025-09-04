package module_4.practices;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan? ");
        
        int bilangan = input.nextInt();
        boolean isPrima = true;

        if (bilangan <= 1) {
            isPrima = false;
        } else {
            for (int i = 2; i * i <= bilangan; i++) {
                if (bilangan % i == 0) {
                    isPrima = false;
                    break;
                }
            }
        }

        if (isPrima) {
            System.out.println(bilangan + " adalah bilangan prima");
        } else {
            System.out.println(bilangan + " bukan termasuk bilangan prima");
        }

        input.close();
    }
}
