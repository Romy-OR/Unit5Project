import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        System.out.println("Welcome to the Fraction Calculator!");
        System.out.println("You can type h for help, or q to quit.");
        String input = "";
        String operation = "";
        Fraction frac1 = new Fraction(1,1);
        Fraction frac2 = new Fraction(1,1);
        while (!input.equals("q")){
            System.out.print("Enter a Fraction operation: ");
            input = Input.nextLine();
            //Splits the input, collects info, and creates fraction objects as long as input starts with "(" aka not simplify or h
            if ((input.substring(0, 1)).equals("(")){
                String numer1 = input.substring((input.indexOf("(") + 1), input.indexOf("/"));
                String denom1 = input.substring((input.indexOf("/") + 1), input.indexOf(")"));
                frac1.setNumerator(Integer.valueOf(numer1));
                frac1.setDenominator(Integer.valueOf(denom1));
                operation = input.substring(input.indexOf(")") + 1, input.indexOf(")") + 2);
                String halftwo = input.substring(input.indexOf(")") + 2);
                String numer2 = halftwo.substring((halftwo.indexOf("(") + 1), halftwo.indexOf("/"));
                String denom2 = halftwo.substring((halftwo.indexOf("/") + 1), halftwo.indexOf(")"));
                frac2.setNumerator(Integer.valueOf(numer2));
                frac2.setDenominator(Integer.valueOf(denom2));
            }
            if (((input.substring(0, 1)).equals("s")) && (input.contains("simplify"))){
                String numer = input.substring((input.indexOf("(") + 1), input.indexOf("/"));
                String denom = input.substring((input.indexOf("/") + 1), input.indexOf(")"));
                Fraction simple =  new Fraction(Integer.valueOf(numer), Integer.valueOf(denom));
                System.out.println(simple.toString());
            }
            else if (input.equals("h")){
                System.out.println("Fractions have parenthesis and no space: (m/n)");
                System.out.println("Operations are +, -, *, /, entered with no space.");
                System.out.println("You can simplify by typing: simplify(m/n)");
                System.out.println("You can check if two fractions are equivalent by: (m1/n1)=(m2/n2)");
                System.out.println("You can use inequalities to compare fraction sizes: (m1/n1)<(m2/n2)");
            }
            else if (operation.equals("+")){
                System.out.println(frac1.addFraction(frac2).toString());
            }
            else if (operation.equals("*")){
                System.out.println(frac1.multiplyFraction(frac2).toString());
            }
            else if (operation.equals("-")){
                System.out.println(frac1.subtractFraction(frac2).toString());
            }
            else if (operation.equals("/")){
                System.out.println(frac1.divideFraction(frac2).toString());
            }
            else if (input.equals("q")){
                System.out.println("Fraction calculator closed.");
            }
            else{
                System.out.println("Invalid input. Type h if you need help.");
            }
        }
    }
}
