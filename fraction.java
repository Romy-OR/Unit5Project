public class Fraction{
    static int numerator;
    static int denominator;
    
    public void Fraction(int num, int denom){
        numerator = num;
        denominator = denom;
    }
    
    public int getNumerator(){
        return numerator;
    }
    
    public int getDenominator(){
        return denominator;
    }
    
    public void setNumerator(int newNum){
        numerator = newNum;
    }
    
    public void setDenominator(int newDenom){
        denominator = newDenom;
    }
    
    public void addFraction(int num2, int denom2){
        int num1 = this.numerator;
        int denom1 = this.denominator;
        int common = denom1 * denom2;
        num1 = num1 * denom2;
        num2 = num2 * denom1;
        System.out.println(num1 + num2 + " / " + common);
    }

}