public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int num, int denom) {
        setNumerator(num);
        setDenominator(denom);
    }

    public void setNumerator(int num) {
        numerator = num;
    }

    public void setDenominator(int denom) {
        if (denom == 0) {
            System.out.println("Error");
            System.exit(1);
        }
        denominator = denom;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String toString() {
        return getNumerator() + "/" + getDenominator();
    }

    public Fraction Simplify() {
        int num = getNumerator();
        int denom = getDenominator();
        int gcd = gcd1(num, denom);
        Fraction simplify = new Fraction(num/gcd, denom/gcd);
        return simplify;
    }

    private int gcd1(int a, int b) {
        int r;
        while (true) {
            r = a%b;
            if (r == 0) break;
            a = b;
            b = r;
        }
        return b;
    }
}
