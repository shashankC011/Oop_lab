import java.util.Scanner;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower and upper limit");
        int n= sc.nextInt(),m = sc.nextInt();
        boolean found = false;
        for(int i = n;i<=m;i++){
            for(int j = 2;j<=i/2;j++){
                if(i%j == 0){
                    found = true;
                }
            }
            if(!found){
                System.out.println(i);
            }
            found = false;
        }
        sc.close();
    }
}
