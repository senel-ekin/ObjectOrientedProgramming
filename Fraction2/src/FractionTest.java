public class FractionTest {
    public static void main(String[] args) {
        Fraction f1,f2,f3,f4,f5;
        f1 = new Fraction(24,36);
        f2 = f1.Simplify();
        f3 = new Fraction(1,3);
        f4 = f1.addition(f3);
        f5 = f4.Simplify();
        System.out.println(f2.toString());
        System.out.println(f5.toString());
    }
}
