import java.util.Scanner;

public class AddQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter value of b: ");
        int b = sc.nextInt();
        System.out.println("A.  "+(a<<2)+(b>>2));
        System.out.println("B.  "+(b>0));
        System.out.println("C.  "+(a+b*100)/10);
        System.out.println("D.  "+(a&b));
        sc.close();
    }
}
