import java.util.Scanner;

public class Date2 {
    private int month2;
    private int day2;
    private int year2;

    public void outputLayout() {
        System.out.println(day2 + "/" + month2 + "/" + year2);
    }

    public void inputs(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day: ");
        day2 = scanner.nextInt();

        System.out.println("Enter month: ");
        month2 = scanner.nextInt();

        System.out.println("Enter year: ");
        year2 = scanner.nextInt();
    }

    public int getDay2() {
        return day2;
    }

    public String getMonth2() {
        if (month2 == 1)
            return "January";
        if (month2 == 2)
            return "February";
        if (month2 == 3)
            return "March";
        else {
            System.out.println("Invalid Input");
            System.exit(0);
            return "invalid";
        }
    }

    public int getYear2() {
        return year2;
    }
}
