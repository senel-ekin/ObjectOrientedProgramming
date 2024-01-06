import java.util.Scanner;

public class SicaklikOrtalamalari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int GUN_SAYISI = 3;
        final int SAAT_SAYISI = 4;
        double[][][] veriler = new double[GUN_SAYISI][SAAT_SAYISI][2];
        for (int i = 0; i < GUN_SAYISI * SAAT_SAYISI; i++) {
            int gun  = scanner.nextInt();
            int saat = scanner.nextInt();
            double sicaklik = scanner.nextDouble();
            double nem = scanner.nextDouble();
            veriler[gun - 1][saat -1][0] = sicaklik;
            veriler[gun - 1][saat -1][1] = nem;
        }

        for (int i = 0; i < GUN_SAYISI; i++) {
            double toplamSicaklik = 0;
            double toplamNem = 0;
            for (int j = 0; j < SAAT_SAYISI; j++) {
                toplamSicaklik += veriler[i][j][0];
                toplamNem += veriler[i][j][1];
            }
            System.out.println(i + " ci günün ortalama sıcaklık değeri " + toplamSicaklik / SAAT_SAYISI);
            System.out.println(i + " ci günün ortalama nem değeri " + toplamNem / SAAT_SAYISI);
        }
    }
}
