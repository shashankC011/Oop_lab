import java.util.Scanner;
class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int numCopy = num;
        int sum = 0;
        while(numCopy != 0){
            sum = sum + ((numCopy%10)*(numCopy%10)*(numCopy%10));
            numCopy = numCopy/10;
        }
        sc.close();
        if(num == sum){
            System.out.println("The number is armstrong");
        }
        else{
            System.out.println("The number is not armstrong");

        }
    }
}