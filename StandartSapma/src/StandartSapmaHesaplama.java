import java.util.Scanner;

public class StandartSapmaHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinizin eleman sayısını veren N tam sayı değerini giriniz: ");
        int N = scanner.nextInt();

        double[] dizi = new double[N];
        System.out.println("Dizinizin elemanlarının değerlerini giriniz: ");
        for (int i = 0; i < N; i++) {
            dizi[i] = scanner.nextDouble();
        }

        System.out.print("Dizi: [");
        for (int i = 0; i < N; i++) {
            System.out.print(dizi[i]);
            if (i < N - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        double toplam = 0;
        double ortalamaDegeri;

        for (int i = 0; i < N; i++) {
            toplam += dizi[i];
        }
        ortalamaDegeri = toplam/N;

        double toplamKareFark = 0;
        for (int i = 0; i < N; i++) {
            toplamKareFark += Math.pow(dizi[i] - ortalamaDegeri, 2);
        }

        double standartSapma = Math.sqrt(toplamKareFark / N);

        System.out.println("Dizinin standart sapması: " + standartSapma);
    }
}
