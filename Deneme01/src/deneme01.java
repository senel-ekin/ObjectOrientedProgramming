public class deneme01 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        double[] dizim01 = new double[20];
        System.out.println(dizim01.length + " adet değer girin: ");
        for (int i = 0; i < dizim01.length; i++) {
            dizim01[i] = Math.random()*100;
            System.out.format("%5.2f ", dizim01[i]);
        }

        System.out.println("");
        char[] adim = {'J', 'a', 'v', 'a'};
        for (int i = 0; i < adim.length; i++) {
            System.out.println(adim[i]);
        }
    }
}
