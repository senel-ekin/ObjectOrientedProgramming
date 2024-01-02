public class InsertionSort {
    public static void main(String[] args) {
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 100);
            System.out.print(array[i] + "  ");
        }

        insertionSort(array);
        System.out.println("");
        printArray(array);
    }

    public static void insertionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            double currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }

            list[k + 1] = currentElement;
        }
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.format("%5.2f  ", array[i]);
        }
    }
}
