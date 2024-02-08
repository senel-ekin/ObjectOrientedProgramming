import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int product = 1;
        int sum = 0;

        while (number != 0) {
            int num = number % 10;
            product *= num;
            sum += num;
            number /= 10;
        }

        int result = product - sum;
        System.out.println("Result: " + result);
    }
}