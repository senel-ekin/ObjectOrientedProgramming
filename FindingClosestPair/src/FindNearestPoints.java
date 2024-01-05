import java.util.Scanner;

public class FindNearestPoints {
    public static void main(String[] args) {
        System.out.println("Enter the number of points: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfPoints = scanner.nextInt();

        int[][] points = new int[numberOfPoints][2];
        System.out.println("Enter " + numberOfPoints + " points: ");

        for (int i = 0; i < numberOfPoints; i++) {
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }

        int n1 = 0, n2 = 1;
        //double distance = 0.0;
        double shortestDistance = findDistance(points[0][0], points[0][1], points[1][0], points[1][1]);
        System.out.println(shortestDistance);
        for (int i = 1; i < numberOfPoints; i++) {
            for (int j = i + 1; j < numberOfPoints; j++){
                double distance = findDistance(points[i][0], points[i][1], points[j][0], points[j][1]);
                System.out.println(distance);
                if (distance < shortestDistance) {
                    n1 = i;
                    n2 = j;
                    shortestDistance = distance;
                }
            }
        }
        System.out.println("The closest two points are " + "(" + points[n1][0] + "," + points[n1][1] + ")" +
                "(" + points[n2][0] + "," + points[n2][1] + ")");
    }

    public static double findDistance(int x1, int y1, int x2, int y2) {
        double value = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return value;
    }
}
