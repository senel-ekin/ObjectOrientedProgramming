import java.util.Scanner;

public class DivisionDemo {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter numerator: ");
            int numerator = scanner.nextInt();
            System.out.println("Enter denominator: ");
            int denominator = scanner.nextInt();

            if (denominator == 0)
                throw new RuntimeException();

            double quotient = numerator / (double) denominator;
            System.out.println(numerator + "/" + denominator + "=" + quotient);

        } catch (RuntimeException e) {
            System.out.println("Be sure the denominator is not zero.");
        }
    }
}
