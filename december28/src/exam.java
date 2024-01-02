import java.util.ArrayList;
import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        // Test programı
        Scanner scanner = new Scanner(System.in);
        int[] sayilar = new int[10];

        System.out.println("Lütfen 10 adet tamsayı giriniz:");

        for (int i = 0; i < 10; i++) {
            sayilar[i] = scanner.nextInt();
        }

        int[] sonuc = fazlaOlanlariSil(sayilar);

        System.out.println("Sonuç:");

        for (int num : sonuc) {
            System.out.print(num + " ");
        }
    }

    public static int[] fazlaOlanlariSil(int[] sayilar) {
        // Tekrar eden fazla öğeleri silme işlemi
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int num : sayilar) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        // ArrayList'i int[] dizisine dönüştürme
        int[] sonuc = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            sonuc[i] = uniqueList.get(i);
        }

        return sonuc;
    }
}
