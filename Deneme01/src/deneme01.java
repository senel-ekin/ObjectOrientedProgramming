public class deneme01 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        double[] dizim01 = new double[20];
        double toplam = 0.0;
        System.out.println(dizim01.length + " adet değer girin: ");
        for (int i = 0; i < dizim01.length; i++) {
            dizim01[i] = Math.random()*100;
            System.out.format("%5.2f ", dizim01[i]);
            toplam = toplam + dizim01[i];
        }

        for (int i = 0; i < dizim01.length; i++) {
            int rasgele = (int)Math.random()*20;
            double gecici = dizim01[i];
            dizim01[i] = dizim01[rasgele];
            dizim01[rasgele] = gecici;
            System.out.println(dizim01[i]);
        }

        double enBuyuk = dizim01[0];
        for (int i = 0; i < dizim01.length; i++) {
            if (enBuyuk < dizim01[i])
                enBuyuk = dizim01[i];
        }

        System.out.println("\nToplam değeri: " + toplam);
        System.out.println("Dizinin en büyük ögesi: " + enBuyuk);
        char[] adim = {'J', 'a', 'v', 'a'};
        for (int i = 0; i < adim.length; i++) {
            System.out.println(adim[i]);
        }

        int[] dizim02 = {1,5,3,4,5,5};
        int enBuyukSayi = dizim02[0];
        for (int i = 0; i < dizim02.length; i++) {
            if (enBuyukSayi <= dizim02[i]) {
                enBuyukSayi = dizim02[i];
            }
        }

        for (int i = 0; i < dizim02.length; i++) {
            if (enBuyukSayi == dizim02[i]) {
                System.out.println("Damga: " + i);
                break;
            }
        }

        System.out.println("");

        int gecici = dizim02[0];
        for (int i = 0; i < dizim02.length; i++) {
            if (i < dizim02.length - 2) {
                dizim02[i] = dizim02[i+1];
            }
            dizim02[0] = dizim02[dizim02.length - 1];
            dizim02[dizim02.length - 1] = gecici;
            System.out.println(dizim02[i]);
        }
    }
}
