public class Fraction{
    private int numerator;
    private int denominator;
    
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
    
    public Fraction addFraction(Fraction frac){
        int num1 = this.numerator;
        int denom1 = this.denominator;
        int num2 = frac.getNumerator();
        int denom2 = frac.getDenominator();
        int common = denom1 * denom2;
        num1 = num1 * denom2;
        num2 = num2 * denom1;
        Fraction added = new Fraction((num1 + num2), common);
        return added;
    }
    
    public Fraction subtractFraction(Fraction frac){
        int num1 = this.numerator;
        int denom1 = this.denominator;
        int num2 = frac.getNumerator();
        int denom2 = frac.getDenominator();
        int common = denom1 * denom2;
        num1 = num1 * denom2;
        num2 = num2 * denom1;
        Fraction subbed = new Fraction((num1 - num2), common);
        return subbed;
    }

    public Fraction multiplyFraction(Fraction frac){
        int num1 = this.numerator;
        int denom1 = this.denominator;
        int num2 = frac.getNumerator();
        int denom2 = frac.getDenominator();
        Fraction product = new Fraction((num1 * num2), (denom1 * denom2));
        return product;
    }  
    
    public Fraction divideFraction(Fraction frac){
        int num1 = this.numerator;
        int denom1 = this.denominator;
        int num2 = frac.getNumerator();
        int denom2 = frac.getDenominator();
        Fraction product = new Fraction((num1 * denom2), (denom1 * num2));
        return product;
    }  
    
    public Fraction simplify(){
        int nnum = this.numerator;
        int ndenom = this.denominator;
        if (this.numerator % this.denominator == 0){
            nnum = nnum / ndenom;
            ndenom = 1;
        }
        else{
            for (int i = 1; i <= (this.denominator/ 2); i++){
                if ((this.denominator % i == 0) && (this.numerator % i == 0)){
                    nnum = this.numerator / i;
                    ndenom = this.denominator / i;
                }
            }
        }
        Fraction simple = new Fraction(nnum, ndenom);
        return simple;
    }
    
    public String toString(){
        Fraction newFrac = this.simplify();
        if (newFrac.denominator == 1){
            return String.valueOf(newFrac.numerator);
        }
        return ("(" + String.valueOf(newFrac.numerator) + "/" + String.valueOf(newFrac.denominator) + ")");
    }
}
