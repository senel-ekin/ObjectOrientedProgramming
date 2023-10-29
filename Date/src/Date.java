import java.util.*;

public class Date {
    private String month;
    private int day;
    private int year;

    public void outputLayout() {
        System.out.println(day + "/" + month + "/" + year);
    }

    public void inputs() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day: ");
        day = scanner.nextInt();

        System.out.println("Enter month: ");
        month = scanner.next();

        System.out.println("Enter year: ");
        year = scanner.nextInt();
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        if (month.equalsIgnoreCase("January"))
            return 1;
        else if (month.equalsIgnoreCase("February"))
            return 2;
        else if (month.equalsIgnoreCase("March"))
            return 3;
        else {
            System.out.println("Incorrect Input");
            System.exit(0);
            return 0;
        }
    }

    public int getYear() {
        return year;
    }

}