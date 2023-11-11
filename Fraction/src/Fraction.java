public class Fraction{
    private int numerator;
    private int denominator;

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void setNumerator(int n1){
        numerator = n1;
    }

    public void setDenominator(int n2){
        denominator = n2;
    }

    public boolean isItEqual(Fraction r1){
        if(numerator == r1.numerator && denominator == r1.denominator)
            return true;
        else
            return false;
    }
}