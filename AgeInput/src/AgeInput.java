import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeInput {
    private static final String DEFAULT_MESSAGE = "Your age?";
    private Scanner scanner;

    public AgeInput() {
        scanner = new Scanner(System.in);
    }

    public int getAge() {
        return getAge(DEFAULT_MESSAGE);
    }

    public int getAge(String message) {
        System.out.println(message);
        int age = 0;
        while (true) {
            try {
                age = scanner.nextInt();
                if (age < 0) {
                    throw new Exception("Negative entry is invalid.");
                }
                return age;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Input is invalid.\n" + "Please enter digits only.");
            }
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
