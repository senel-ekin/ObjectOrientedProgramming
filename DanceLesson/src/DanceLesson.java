import java.util.Scanner;

public class DanceLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of female dancers: ");
        int women = scanner.nextInt();

        System.out.println("Enter number of male dancers: ");
        int men = scanner.nextInt();

        if (men == 0 && women == 0) {
            System.out.println("Lesson is canceled.");
            System.exit(0);
        }

        if (men == 0) {
            System.out.println("Lesson is canceled. No men.");
            System.exit(0);
        }

        if (women == 0) {
            System.out.println("Lesson is canceled. No women.");
            System.exit(0);
        }

        if (women >= men)
            System.out.println("Each men must dance with " +
                    women / (double)men + " women.");
        else
            System.out.println("Each women must dance with " +
                    men / (double)women + " men.");

        System.out.println("Begin the lesson.");
    }
}
