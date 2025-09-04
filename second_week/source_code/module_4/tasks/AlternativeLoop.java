package module_4.tasks;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AlternativeLoop {
    public static void traditionalLoop(int[] arr) {
        System.out.print("array x: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void enhancedLoop(int[] arr) {
        for (int element : arr) {
            System.out.print(element);
            if (element != arr.length) {
                System.out.print(", ");
            }
        }
    }

    public static void whileMethod(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
            i++;
        }
    }

    public static void streamMethod(int[] arr) {
        String result = Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.print("array x: ");
        System.out.print(result);
    }

    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // traditionalLoop(x);
        // enhancedLoop(x);
        // whileMethod(x);
        streamMethod(x);

    }
}
