public class SelectionSort {
    public static void main(String[] args) {
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 100);
            System.out.print(array[i] + "  ");
        }

        selectionSort(array);
        System.out.println("");
        printArray(array);
    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            // Find the minimum in the list[i..list.lenght-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.format("%5.2f  ", array[i]);
        }
    }
}
