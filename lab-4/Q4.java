import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][]a = create2DArray();
        int[][]b = create2DArray();
        System.out.println("Sum of Array A and B: ");
        display2dArray(calcSum(a, b));
        System.out.println();
        System.out.println("Mul of Array A and B: ");
        display2dArray(matrixMul(a,b));
        sc.close();
    }

    static int[][] create2DArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the Matrix: ");
        String name = sc.nextLine();
        System.out.println("Enter rows and columns of matrix " + name+ ": ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] array = new int[row][col];
        for (int i = 0 ; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter element R" +(i+1)+"C"+(j+1) );
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }

    static void display2dArray(int array [][]){
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element+ "  ");
            }
            System.out.println();
        }
    }

    static int[][] calcSum(int[][]a,int[][]b){
        if(a.length != b.length || a[0].length != b[0].length){
            System.out.println("Both matrix should have the same dimensions");
            return null;
        }
        int[][]c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j]+b[i][j];
                }
            }
        return c;
    }

    static int[][] matrixMul(int[][]a,int[][]b){
        if(a[0].length != b.length){
            System.out.println("Number of columns in matrix A should be equal to number of rows in B");
            return null;
        }
        int c[][]= new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                c[i][j] = 0;
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return c;
    }
}
