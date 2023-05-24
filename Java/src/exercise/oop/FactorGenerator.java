package exercise.oop;

public class FactorGenerator {

    private int number ;
    private int nextFactor ;

    public FactorGenerator (int numberToFactor ){
        number = numberToFactor  ;
        nextFactor = 2 ;
    }

    public boolean hasMoreFactors (){
        return number != 1 ;
    }

    public int nextFactor (){
        if (number % nextFactor != 0) {
            while (number % nextFactor != 0) {
                nextFactor++;
            }
        }
        number = number/nextFactor ;
        return nextFactor ;
    }
}