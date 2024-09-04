class Complex{
    int real;
    int imaginary;
    
    Complex(){
        real = -1;
        imaginary = -1;
    }
    Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    Complex(int real){
        this.real = real;
        imaginary = 0;
    }
    static Complex add(int real, Complex complex){
        int realPart = real + complex.real;
        int imaginaryPart = complex.imaginary;
        return new Complex(realPart, imaginaryPart);
    }
    static Complex add(Complex c1, Complex c2){
        int realPart = c1.real + c2.real;
        int imaginaryPart = c1.imaginary+ c2.imaginary;
        return new Complex(realPart, imaginaryPart);
    }
    void display_Sum(){
        System.out.println(real + " + " +imaginary+"i");
    }
}
public class Complex_Q4 {
    public static void main(String[] args) {
        Complex c1 = new Complex(5,3);
        Complex c2 = new Complex(10);
        Complex c3 = Complex.add(c1,c2);
        c3.display_Sum();
    }
}
