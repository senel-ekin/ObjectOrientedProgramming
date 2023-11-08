import java.util.Scanner;
public class planetAge {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age on Earth: ");
        int earthAge = scanner.nextInt();

        int mercuryDays = 88;
        int venusDays = 225;
        int jupiterDays = 4380;
        int saturnDays = 10767;

        double mercuryAge = (earthAge * 365.0) / mercuryDays;
        double venusAge = (earthAge * 365.0) / venusDays;
        double jupiterAge = (earthAge * 365.0) / jupiterDays;
        double saturnAge = (earthAge * 365.0) / saturnDays;

        System.out.println("Your age on Mercury: " + (int) mercuryAge + " years");
        System.out.println("Your age on Venus: " + (int) venusAge + " years");
        System.out.println("Your age on Jupiter: " + (int) jupiterAge + " years");
        System.out.println("Your age on Saturn: " + (int) saturnAge + " years");

        scanner.close();
    }
}