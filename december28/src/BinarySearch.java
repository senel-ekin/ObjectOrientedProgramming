import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
            System.out.print(array[i] + "  ");
        }

        // Sort the array
        Arrays.sort(array);

        System.out.println("\nSorted Array: ");
        for (int num : array) {
            System.out.print(num + "  ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the number to search for: ");
        int key  = scanner.nextInt();
        int result = binarySearch(array,key);

        if (result >= 0) {
            System.out.println("Number found at index: " + result);
        } else {
            System.out.println("Number not found in the array.");
        }
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid]) {
                return mid;
            }
            else
                low = mid + 1;
        }

        return -low - 1; //Now high < low, key not found
    }
}
