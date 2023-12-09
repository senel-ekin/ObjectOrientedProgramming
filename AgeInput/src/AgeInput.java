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
        int age = scanner.nextInt();
        return age;
    }
}
