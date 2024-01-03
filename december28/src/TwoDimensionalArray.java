import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matrisin satır boyunu girin: ");
        int format = scanner.nextInt();
        int[][] dizim01 = new int[format][format];
        System.out.println("Matris ögelerini girin: ");
        for (int i = 0; i < dizim01.length; i++) {
            for (int j = 0; j < dizim01[i].length; j++) {
                dizim01[i][j] = scanner.nextInt();
            }
        }
    }
}
