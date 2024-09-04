import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = 'y';
        do{
            System.out.println("Enter num 1: ");
            float num1 = sc.nextFloat();
            System.out.println("Enter num 2: ");
            float num2 = sc.nextFloat();
            sc.nextLine();
            System.out.println("Enter the operation to be performed(add, sub, mul, div): ");
            String opp = sc.nextLine();
            switch(opp){
                case "add":
                System.out.println(num1+num2); 
                break;

                case "sub":
                System.out.println(num1 - num2);
                break;

                case "mul":
                System.out.println(num1 * num2);
                break;

                case "div":
                System.out.println(num1 / num2);
                break;
                
                default:
                System.out.println("Enter either add, sub, mul,div");
                break;
            }
            System.out.println("do you want to continue: y or n");
            c = sc.next().charAt(0);
                while(c != 'y' && c != 'n'){
                    System.out.println("Enter either y or n only");
                    c = sc.next().charAt(0);
                }
        }while(c == 'y');
        sc.close();
    }
}
