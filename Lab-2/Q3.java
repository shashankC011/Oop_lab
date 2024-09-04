import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        System.out.println("num divided by 2: "+(num>>1));
        System.out.println("num multiplied by 2: "+(num<<1));
        sc.close();

    }
}
