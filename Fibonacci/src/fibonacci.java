import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        double sqrt5 = Math.sqrt(5);
        double a = (1 + sqrt5) / 2;
        double b = (1 - sqrt5) / 2;

        double A = Math.pow(a,N);
        double B = Math.pow(b,N);
        double C = Math.sqrt(5);

        double result = (A-B)/C;

        int resultInt = (int) result;

        System.out.println("Result" + "=" + resultInt);

    }
}