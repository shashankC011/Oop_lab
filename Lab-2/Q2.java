import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int num = sc.nextInt();
        System.out.println("Enter double: ");
        double doubleNum = sc.nextDouble();
        System.out.println("Enter char: ");
        char c = sc.next().charAt(0);
        byte byteNum = (byte)num;
        System.out.println(byteNum);
        int charToInt = (int)c;
        System.out.println(charToInt);
        byte byteDouble = (byte)doubleNum;
        System.out.println(byteDouble);
        int doubleToInt = (int)doubleNum;
        System.out.println(doubleToInt);
        sc.close();
    }
    
}
