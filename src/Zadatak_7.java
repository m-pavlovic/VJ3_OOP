//Zadatak 7: Generirajte proizvoljni 2D niz tipa int (3x4), te pronađite i ispišite maksimalnu vrijednost u nizu.

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Zadatak_7 {

    /**
     * method that fills the 2D Array with randomly generated numbers
     * @return 2D integer array
     */
    public static int[][] fillArr() {
        int[][] arr2D = new int[3][4];
        int rows = arr2D.length;
        int columns = arr2D[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr2D[i][j] = ThreadLocalRandom.current().nextInt(-100, 100);
                System.out.print(arr2D[i][j] +"\t");
            }
            System.out.println("\n");
        }
        System.out.println("Array is filled!");
        return arr2D;
    }


    public static int maxInArray(int[][] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        return max;
    }


    public static void main(String[] args) {
        int[][] array2D = Zadatak_7.fillArr();
        //System.out.println(Arrays.deepToString(array2D));
        int max = Zadatak_7.maxInArray(array2D);
        System.out.println("Max in the 2D Array is: " +max);

    }
}