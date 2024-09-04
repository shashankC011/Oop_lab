class Number{
    private double value;
    Number(){
        value = -1;
    }
    Number(double value){
        this.value = value;
    }
    Boolean isZero(){
        if(value == 0){
            return true;
        }
        return false;
    }
    Boolean isPositive(){
        if(value >0){
            return true;
        }
        return false;
    }
    Boolean isNegative(){
        if(value <0){
            return true;
        }
        return false;
    }
    Boolean isOdd(){
        if(value%2 == 0){
            return false;
        }
        return true;
    }
    Boolean isEven(){
        if(value%2 == 0){
            return true;
        }
        return false;
    }
    Boolean isPrime(){
        for (int i = 2; i <= value/2; i++) {
            if(value%i == 0){
                return false;
            }
        }
        return true;
    }
    Boolean isArmstrong(){
        double sum = 0;
        int val = (int)value;
        int numDigits = Integer.toString(val).length();
        while(val > 0){
            sum = sum + Math.pow((val%10),numDigits);
            val = val/10;
        }
        if(sum == value){
            return true;
        }
        return false;
    }
}
public class Number_Q5 {
    public static void main(String[] args) {
        Number n1 = new Number(153);
        System.out.println("Is Zero: "+ n1.isZero() + "     Is Positive: "+ n1.isPositive() + "  Is Negative: "+ n1.isNegative() + "    Is Even: "+ n1.isEven() + "     Is Odd: "+ n1.isOdd() + "   Is Prime: "+ n1.isPrime() + "    Is Armstrong: "+ n1.isArmstrong());
    }
}
