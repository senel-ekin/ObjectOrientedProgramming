import static java.lang.System.arraycopy;

public class array02 {
    public static void main(String[] args) {
        double[] array01 = new double[10];
        for (int i = 0; i < array01.length; i++) {
            array01[i] = Math.random()*100;
            System.out.format("%5.2f  ", array01[i]);
        }

        System.out.println("");
        double[] array02 = new double[10];


        arraycopy(array01,2,array02,2,5);

        for (int i = 0; i < array01.length; i++)
            System.out.format("%5.2f  ", array02[i]);
        printArray(array01);
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("\nArray elements: " + array[i]);
        }
    }
}
