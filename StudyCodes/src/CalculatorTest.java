import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = getNumber(scanner, 1);
        int num2 = getNumber(scanner, 2);

        String op;
        do {
            System.out.println("Select operator (+, -, ., /): ");
            op = scanner.next();
        } while (!op.matches("[+\\-./]"));

        String[] arguments = {String.valueOf(num1), op, String.valueOf(num2)};
        Calculator.main(arguments);
    }

    private static int getNumber(Scanner scanner, int index) {
        int enteredNumber = 0;
        while (true) {
            try {
                System.out.print("Enter number " + (index) + ": ");
                String input = scanner.next();

                enteredNumber = Integer.parseInt(input);

                if (enteredNumber < 0) {
                    throw new Exception("Negative entry is invalid.");
                }

                    break;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Input is invalid.\nPlease enter digits only.");
            } catch (Exception e) {
                System.out.println("Error: Wrong Input. " + e);
            }
        }
        return enteredNumber;
    }
}
