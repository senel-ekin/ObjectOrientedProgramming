public class array03 {
    public static void main(String[] args) {
        double[] array01 = new double[10];
        int x = 0;
        for (int i = 0; i < array01.length; i++) {
            array01[i] = Math.random() * 100;
            System.out.format("%5.2f  ", array01[i]);
        }

        System.out.println("");
        printArray(array01);
        System.out.println("x: " + x);
        method(array01, x);
        printArray(array01);
        System.out.println("x: " + x);
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
}

//After printing, the x values output as zero even though we have x = 5 in our method.
// This is because the x value defined in the method is another data.
// Even if the names are the same, the x value defined at the beginning is output.
// We also need to get the x value to fix this.