import java.util.*;
class AgeInputVer5 {
    private static final String DEFAULT_MESSAGE = "Your age:";
    private static final int DEFAULT_LOWER_BOUND = 0;
    private static final int DEFAULT_UPPER_BOUND = 99;

    private int lowerBound;
    private int upperBound;

    private Scanner scanner;

    public AgeInputVer5() {
        init(DEFAULT_LOWER_BOUND, DEFAULT_UPPER_BOUND);
    }
    public AgeInputVer5(int low, int high) throws IllegalArgumentException {
        if (low > high) {
            throw new IllegalArgumentException(
                    "Low (" + low + ") was " + "larger than high(" + high + ") "
            );
        } else {
            init(low, high);
        }
    }
    public int getAge() throws AgeInputException {
        return getAge(DEFAULT_MESSAGE);
    }
    public int getAge(String prompt) throws AgeInputException {
        int age;
        while (true) {
            System.out.print(prompt);
            try {
                age = scanner.nextInt();
                if (age < lowerBound || age > upperBound) {
                    throw new AgeInputException(lowerBound, upperBound, age);
                }
                return age; //input okay so return the value & exit
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Input is invalid.\n" +
                        "Please enter digits only");
            }
        }
    }
    private void init(int low, int high) {
        lowerBound = low;
        upperBound = high;
        scanner = new Scanner(System.in);
    }
}
