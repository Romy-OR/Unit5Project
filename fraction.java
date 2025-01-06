public class Fraction{
    static int numerator;
    static int denominator;
    
    public Fraction(int num, int denom){
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
    
    public String addFraction(int num2, int denom2){
        int num1 = this.numerator;
        int denom1 = this.denominator;
        int common = denom1 * denom2;
        num1 = num1 * denom2;
        num2 = num2 * denom1;
        int sum = num1 + num2;
        return ("(" + String.valueOf(sum) + "/" + String.valueOf(common) + ")");
    }
    
    public String simplify(){
        String nnum = String.valueOf(this.numerator);
        String ndenom = String.valueOf(this.denominator);
        for (int i = 1; i <= (this.denominator/ 2); i++){
            if ((this.denominator % i == 0) && (this.numerator % i == 0)){
                nnum = String.valueOf(this.numerator / i);
                ndenom = String.valueOf(this.denominator / i);
            }
        }
        return ("(" + nnum + "/" + ndenom + ")");
    }
}
