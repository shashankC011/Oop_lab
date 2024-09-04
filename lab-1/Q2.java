public class Q2 {
    public static void main(String[] args) {
        int num,pos=0,neg=0,zero=0;
        for(int i = 0; i<10;i++){
            num = Integer.parseInt(args[i]);
            if(num > 0){
                pos++;
            }
            else if(num<0){
                neg++;
            }
            else{
                zero++;
            }
        }
        System.out.println("number of positive: "+pos+"number of negative:  "+neg+"number of zeroes: "+zero);
    }
}

