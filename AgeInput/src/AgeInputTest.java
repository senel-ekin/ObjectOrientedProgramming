import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class AgeInputTest {
    public static void main(String[] args) {
        GregorianCalendar today;
        int age, thisYear, bornYear;
        String answer;
        Scanner scanner = new Scanner(System.in);
        AgeInput input = new AgeInput();
        age = input.getAge("How old are you?");

        today = new GregorianCalendar();
        thisYear = today.get(Calendar.YEAR);

        bornYear = thisYear - age;

        System.out.println("Already had your birthday this year? (Y or N)");
        answer = scanner.next();

        if (answer.equals("N") || answer.equals("n")) {
            bornYear--;
        }
        System.out.println("\nYou are born in " + bornYear);
    }
}
