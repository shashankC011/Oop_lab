public class AddQ2 {
    public static void main(String[] args) {
        int num,result;
        result = 1;
        num = Integer.parseInt(args[0]);
        for(int i = num; i>0;i--){
            result = result*i;
        }
        System.out.println("The factorial of the given number is:   " + result);
    }
}
