import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array01 = new int[10];
        for (int i = 0; i < array01.length; i++) {
            array01[i] = (int)(Math.random()*100);
            System.out.print(array01[i] + "  ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the number to search for: ");
        int key = scanner.nextInt();
        int result = linearSearch(array01, key);

        if (result != -1)
            System.out.println("\"Number found at index: " + result);
        else
            System.out.println("Number not found in the array.");

    }
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }
}
