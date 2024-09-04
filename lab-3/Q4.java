import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        int a[] = {1,2,3,1,2,1,5,6,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be searched");
        int num = sc.nextInt();
        int i = 0;
        for(int ele: a){

            if(ele == num){
                System.out.println("Element found at pos: " + i);
            }
            i++;
        }
        sc.close();
    }
}
