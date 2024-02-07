import java.util.*;
import java.io.*;

public class FirstFactorial {
    public static int FirstFactorial(int num) {
        int total = 1;
        for(int i = 1; i <= num; i++) {
            total *= i;
        }
        System.out.println("Output: " + total);
        return num;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print("Input: ");
        int num = s.nextInt();
        System.out.print(FirstFactorial(num));
        System.out.print(FirstFactorial(s.nextInt()));
    }
}
