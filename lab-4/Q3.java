import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows and columns of the matrix: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int a[][] = new int[row][col];
        for (int i = 0 ; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter element R" +(i+1)+"C"+(j+1) );
                a[i][j] = sc.nextInt();
            }
        }
        boolean flag = true;
        for (int i = 0 ; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(a[i][j]!=a[j][i]){
                    flag = false;
                }
            }
        }
        if(flag){
            System.out.println("Symmetric matrix");
        }
        else{
            System.out.println("Not a symmetric matrix");
        }
        sc.close();
    }
}

