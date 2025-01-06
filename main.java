public class Main
{
    public static void main(String[] args){
        //String frac = "42786/399";
        //int split = frac.indexOf("/");
        //String numer = frac.substring(0, split);
        //String denom = frac.substring(split + 1);
        //System.out.println(numer);
        //System.out.println(denom);
        Fraction frac = new Fraction(1, 2);
        System.out.println(frac.addFraction(2, 4));
    }
}
