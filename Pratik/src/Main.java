import java.util.Scanner;

public class Main {
    //En büyük ikinci sayıyı bulan metod
    public static int ikinciEnBuyuk(int[] dizi) {
        int enBuyuk = dizi[0];
        int ikinci = Integer.MIN_VALUE;

        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk) {
                ikinci = enBuyuk;
                enBuyuk = dizi[i];
            } else if (dizi[i] > ikinci && dizi[i] != enBuyuk) {
                ikinci = dizi[i];
            }
        }

        return ikinci;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç elemanlı bir dizi gireceksiniz? ");
        int n = input.nextInt();

        int[] dizi = new int[n];
        System.out.println(n + " adet sayı giriniz:");
        for (int i = 0; i < n; i++) {
            dizi[i] = input.nextInt();
        }

        System.out.println("İkinci en büyük sayı: " + ikinciEnBuyuk(dizi));
    }
}
