public class FractionTest {
    public static void main(String[] args){
        Fraction r1 = new Fraction();
        Fraction r2 = new Fraction();
        r1.setNumerator(3);
        r1.setDenominator(5);
        r2.setNumerator(1);
        r2.setDenominator(4);
        r1.isItEqual(r2);
        System.out.println(r1.isItEqual(r2));
    }
}
