import java.util.Scanner;

public class tekrar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin eleman sayısını girin: ");
        int n = input.nextInt();

        int[] dizi = new int[n];
        System.out.println(n + " adet sayı giriniz:");
        for (int i = 0; i < n; i++) {
            dizi[i] = input.nextInt();
        }

        System.out.print("Tekrar eden sayılar: ");
        tekrarEdenleriBul(dizi);
    }

    public static void tekrarEdenleriBul(int[] dizi) {
        int[] tekrarEdenler = new int[dizi.length];
        int tekrarSayaci = 0;

        for (int i = 0; i < dizi.length; i++) {
            boolean tekrarVar = false;
            boolean dahaOnceEklendi = false;

            for (int k = 0; k < tekrarSayaci; k++) {
                if (tekrarEdenler[k] == dizi[i]) {
                    dahaOnceEklendi = true;
                    break;
                }
            }
            if (dahaOnceEklendi) continue;

            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    tekrarVar = true;
                    break;
                }
            }

            if (tekrarVar) {
                tekrarEdenler[tekrarSayaci] = dizi[i];
                tekrarSayaci++;
            }
        }

        if (tekrarSayaci == 0) {
            System.out.println("Tekrar eden sayı yok.");
        } else {
            System.out.print("Tekrar eden sayılar: ");
            for (int i = 0; i < tekrarSayaci; i++) {
                System.out.print(tekrarEdenler[i] + " ");
            }
            System.out.println();
        }
    }
}
