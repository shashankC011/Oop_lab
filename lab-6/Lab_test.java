import java.util.Scanner;
public class Lab_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimension of square matrix: ");
        int dim = sc.nextInt();
        int a[][] = new int[dim][dim];
        int result[][] = new int[dim][dim];

        for (int i = 0 ; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.println("Enter element R" +(i+1)+"C"+(j+1) );
                a[i][j] = sc.nextInt();
            }
        }

        transpose(a, result);
        System.out.println();
        System.out.println("Matrix before: ");
        displayArray(a);
        System.out.println();
        System.out.println("Matrix after transpose: ");
        displayArray(result);
        sc.close();
    }
    static int[][] transpose(int[][]a,int [][]result){
        for (int i = 0 ; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                result[i][j]=a[j][i];
            }
        }
        return result;
    }

    static void displayArray(int[][]result){
        for (int i = 0 ; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
