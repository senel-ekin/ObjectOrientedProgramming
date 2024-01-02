import java.util.Scanner;

public class examA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sayilar = new int[10];

        System.out.println("Lütfen 10 adet tamsayı giriniz:");

        for (int i = 0; i < 10; i++) {
            sayilar[i] = scanner.nextInt();
        }

        int[] sonuc = fazlaOlanlariSil(sayilar);

        System.out.println("Sonuç:");

        for (int i = 0; i < sonuc.length; i++) {
            if (sonuc[i] != -1) {
                System.out.print(sonuc[i] + " ");
            }
        }
    }

    public static int[] fazlaOlanlariSil(int[] sayilar) {
        // Döngü içinde tekrar eden elemanları -1 ile işaretleme
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = i + 1; j < sayilar.length; j++) {
                if (sayilar[i] == sayilar[j]) {
                    sayilar[j] = -1;
                }
            }
        }

        return sayilar;
    }
}
