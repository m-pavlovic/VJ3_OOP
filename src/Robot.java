import java.util.UUID;

public class Robot {

    private String name;
    private int id;
    private static int cntID = 10;
    private int[][] arr2D;
    public static final int RWMX = 5;
    public static final int CLMX = 4;
    private int cntFillingArray;


    public Robot(String name) {
        this.name = name;
        this.id = cntID++;
        arr2D = new int[RWMX][CLMX];
        cntFillingArray = 0;
    }

    public static int getCntID() {
        return cntID;
    }

    public static void setCntID(int cntID) {
        Robot.cntID = cntID;
    }

    public int[][] getArr2D() {
        return arr2D;
    }

    public void setArr2D(int[][] arr2D) {
        this.arr2D = arr2D;
    }

    public int getCntFillingArray() {
        return cntFillingArray;
    }

    public void setCntFillingArray(int cntFillingArray) {
        this.cntFillingArray = cntFillingArray;
    }

    public void speak() {
        System.out.println("Hello human - my name is: " + this.name);
        String uuid = UUID.randomUUID().toString();
        System.out.println("This is my message to you:\n" + uuid);
    }

    public void walk() {
        System.out.println("I roboti znaju hodati!");
    }


    public void fillArr() {
        if (cntFillingArray < RWMX*CLMX) {
            int rw = cntFillingArray / CLMX;
            int col = cntFillingArray % CLMX;
            arr2D[rw][col] = cntFillingArray;
            cntFillingArray++;
        } else {
            System.out.println("The array is full!");
        }
    }

    public void print2DArray() {
        for (int k = 0; k < RWMX; k++) {
            for (int q = 0; q < CLMX; q++) {
                System.out.print(arr2D[k][q] + "\t");
            }
            System.out.println();
        }
    }

    public void print2DArraySecond() {
        for (int[] row : arr2D) {
            for (int col : row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }
}
