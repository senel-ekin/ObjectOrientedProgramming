import java.text.DecimalFormat;
import java.util.Scanner;

public class SleepStatistics {
    private Scanner scanner;

    public static void main(String[] args){
        SleepStatistics prog = new SleepStatistics();
        prog.start();
    }

    public SleepStatistics(){
        scanner = new Scanner(System.in);
    }

    public void start(){
        double sleepHour;
        double sum = 0;
        int counter = 0;
        System.out.println("Enter the dorm name: ");
        String dorm = scanner.next();

        sleepHour = getSleepHour("Enter sleep hours (0 - to stop): ");
        while (sleepHour != 0){
            sum += sleepHour;
            counter++;
            sleepHour = getSleepHour("Enter sleep hours");
        }

        if(counter == 0) {
            System.out.println("No Data Entered!");
        } else {
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println("Average sleep time for " + dorm + " is \n\n" +
                    df.format(sum/counter) + "hours.");
        }
    }

    public double getSleepHour(String message) {
        System.out.println(message);
        return scanner.nextDouble();
    }
}
