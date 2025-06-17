import java.util.Scanner;

public class ters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        int sonuc = tersiniBul(sayi);
        System.out.println("Ters: " + sonuc);
    }

    public static int tersiniBul(int sayi) {
        int ters = 0;

        while (sayi != 0) {
            int basamak = sayi % 10;
            ters = ters * 10 + basamak;
            sayi /= 10;
        }
        return ters;
    }
}
