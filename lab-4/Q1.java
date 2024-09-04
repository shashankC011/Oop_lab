import java.util.Scanner;

class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimension of the square matrix: ");
        int dimension = sc.nextInt();
        int a[][] = new int[dimension][dimension];
        for (int i = 0 ; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.println("Enter element R" +(i+1)+"C"+(j+1) );
                a[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        
        for (int i = 0 ; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(i+j == (dimension-1) ){
                    System.out.print(a[i] [j]+ " ");
                    sum = sum + a[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("sum: "+ sum);

        sc.close();
    }
}