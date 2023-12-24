public class array03 {
    public static void main(String[] args) {
        double[] array01 = new double[10];
        int x = 0;
        for (int i = 0; i < array01.length; i++) {
            array01[i] = Math.random() * 100;
            //System.out.format("%5.2f  ", array01[i]);
        }

        System.out.println("");
        printArray(array01);
        System.out.println("x: " + x);
        method(array01, x);
        printArray(array01);
        System.out.println("x: " + x);
        swap2(array01);
        printArray(array01);
        System.out.println("");
        printArray(reverse(array01));
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.format("%5.2f  ", array[i]);
        }
    }

    public static void method(double[] array, int x) {
        x = 5;
        array[1] = 0.0;
    }

    public static void swap(double n1, double n2) {
        double temp = n1;
        n1 = n2;
        n2 = temp;
    } //pass-by-value (in this case the elements of the array do not change and the method does not work)

    public static void swap2(double[] array) {
        double temp = array[2];
        array[2] = array[3];
        array[3] = temp;
    } //pass-by-reference (in this case the elements of the array change and the method works)

    public static double[] reverse(double[] array) {
        double[] result = new double[array.length];

        for (int i = 0, j = array.length - 1;
             i < array.length; i++, j--) {
            result[j] = array[i];
        }
        return result;
    }
}

// After printing, the x values output as zero even though we have x = 5 in our method.
// This is because the x value defined in the method is another data.
// Even if the names are the same, the x value defined at the beginning is output.
// We also need to get the x value to fix this.