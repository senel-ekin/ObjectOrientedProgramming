import java.util.Scanner;

public class DanceLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of female dancers: ");
        int women = scanner.nextInt();

        System.out.println("Enter number of male dancers: ");
        int men = scanner.nextInt();

        try {
            if (men == 0 && women == 0)
                throw new Exception("Lesson is canceled.");
            else if (men == 0)
                throw new Exception("Lesson is canceled. No men.");
            else if (women == 0)
                throw new Exception("Lesson is canceled. No women.");

            if (women >= men)
                System.out.println("Each men must dance with " +
                        women / (double) men + " women.");
            else
                System.out.println("Each women must dance with " +
                        men / (double) women + " men.");
        }

        catch(Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }

        System.out.println("Begin the lesson.");
    }
}
