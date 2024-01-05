public class SeriesHalf {
    public static void main(String[] args) {
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random()*100;
            System.out.print(array[i] + " ");
        }

        System.out.println();
        half(array);
    }

    public static void half(double[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = list[i]/2;
            System.out.print(list[i] + " ");
        }
    }
}
