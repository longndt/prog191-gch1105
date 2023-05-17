package practice;

import java.util.Scanner;

public class FactorPrinter {
    public static void main (String [] args ){
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter a number : ");
        int number = sc.nextInt ();
        FactorGenerator toFactor = new FactorGenerator (number);
        while (toFactor.hasMoreFactors ()){
            System.out.print(toFactor.nextFactor() + "  ");
        }
    }
}
