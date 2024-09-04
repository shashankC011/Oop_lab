import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = create2DArray();
        if(isMagicMatrix(a)){
            System.out.println("The given matrix is a magic matrix");
        }
        else{
            System.out.println("The given matrix is not a magic matrix");
        }
        sc.close();

    }
    static int[][] create2DArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the Matrix: ");
        String name = sc.nextLine();
        System.out.println("Enter dimension of matrix " + name+ ": ");
        int dimension = sc.nextInt();
        int[][] array = new int[dimension][dimension];
        for (int i = 0 ; i < dimension; i++) {
            for (int j = 0; j< dimension; j++) {
                System.out.println("Enter element R" +(i+1)+"C"+(j+1) );
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }

    static boolean isMagicMatrix(int a[][]){
        int magicConstant = PrincipalDiagonalSum(a);
        for (int i = 0; i < a.length; i++) {
            if(rowSum(a, i) != magicConstant || colSum(a, i)!= magicConstant || nonPrincipalDiagonalSum(a) != magicConstant){
                return false;
            }
        }
        return true;
    }

    static int nonPrincipalDiagonalSum(int a[][]){
        int sum = 0;
        int dimension = a.length;
        for (int i = 0 ; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if(i+j == (dimension-1) ){
                    sum = sum + a[i][j];
                }
            }
        }
        return sum;
    }

    static int PrincipalDiagonalSum(int a[][]){
        int sum = 0;
        int dimension = a.length;
        for (int i = 0 ; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if(i==j){
                    sum = sum + a[i][j];
                }
            }
        }
        return sum;
    }
    static int rowSum(int a[][],int row){
        int sum  = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[row][i];
        }
        return sum;

    }
    static int colSum(int a[][],int col){
        int sum  = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i][col];
        }
        return sum;
    }
}
