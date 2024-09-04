public class AddQ1 {
    public static void main(String[] args) {
        int num,rev,orig;
        rev = 0;
        num = Integer.parseInt(args[0]);
        orig = num;
        while(num != 0){
            rev = rev*10 + num%10;
            num = num/10;
        } 
        if(orig == rev){
            System.out.println(orig + " is a palindrome");
        }
        else{
            System.out.println(orig+ "  is not a palindrome");
        }

    }
}		