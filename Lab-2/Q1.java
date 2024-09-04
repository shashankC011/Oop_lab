import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        sc.close();
        System.out.println(leapYear(year));
    }

    static boolean leapYear(int year){
        if(year%4 != 0){
            return false;
        }
        else{
            if(year % 100 != 0){
                return true;
            }
            else{
                if(year % 400 != 0){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
    }
}