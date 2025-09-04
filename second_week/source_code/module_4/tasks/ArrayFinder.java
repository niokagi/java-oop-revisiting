package module_4.tasks;

public class ArrayFinder {
    public static void main(String[] args) {
        int[][] arrayOfInts = {
                { 32, 87, 3, 589 },
                { 12, 1076, 2000, 8 },
                { 622, 127, 77, 955 }
        };
        int searchFor = 12;
        int positionRow = -1;
        int positionCol = -1;

        for (int i = 0; i < arrayOfInts.length; i++) {
            for (int j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == searchFor) {
                    positionRow = i;
                    positionCol = j;

                    break;
                }
            }
        }
        if (positionRow != -1) {
            System.out.println("Found " + searchFor + " at " + positionRow + ", " + positionCol);
        } else {
            System.out.println(searchFor + " not found in the array.");
        }
    }
}
