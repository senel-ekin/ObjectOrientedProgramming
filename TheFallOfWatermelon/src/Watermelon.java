import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        double initialHeight, position, hitGround;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial height: ");
        initialHeight = scanner.nextDouble();

        hitGround = Math.sqrt(initialHeight / 16.0);
        hitGround = Math.round(hitGround * 10000.0) / 10000.0;
                                    //convert to four decimal places
        System.out.println("Initial Height: " + initialHeight);

        System.out.print("\nTime t");
        System.out.println("     " + "Position at time t");

        for (int t = 0; t < hitGround; t++){
            position = -16 * t * t + initialHeight;
            System.out.print(t);
            System.out.println("            " + position);
        }

        System.out.println("\nThe moment it hits the ground " + hitGround);
    }
}
