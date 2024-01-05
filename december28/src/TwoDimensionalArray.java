import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matrisin satır boyunu girin: ");
        int format = scanner.nextInt();
        int[][] dizim01 = new int[format][format];
        //System.out.println("Matris ögelerini girin: ");

        for (int i = 0; i < dizim01.length; i++) {
            for (int j = 0; j < dizim01[i].length; j++) {
                dizim01[i][j] = (int)(Math.random() * 10);
            }
        }

        for (int i = 0; i < dizim01.length; i++) {
            for (int j = 0; j < dizim01[i].length; j++)
                System.out.print(" " + dizim01[i][j]);
            System.out.println();
        }

        int enBuyukSatirToplami = 0;
        for (int j = 0; j < dizim01[0].length; j++) {
            enBuyukSatirToplami += dizim01[0][j];
        }

        int enBuyuk = 0;
        for (int i = 1; i < dizim01.length; i++) {
            int toplam = 0;
            for (int j = 0; j < dizim01[i].length; j++)
                toplam += dizim01[i][j];
            if (toplam > enBuyukSatirToplami) {
                enBuyukSatirToplami = toplam;
                enBuyuk = i;
            }
        }
        System.out.println(enBuyukSatirToplami);
        System.out.println("En büyük toplamın olduğu satırın damgası: " + enBuyuk);
    }
}
