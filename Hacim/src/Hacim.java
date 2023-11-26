import java.util.Scanner;

public class Hacim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kola paketinin fiyatını girin: ");
        double paketFiyati = scanner.nextDouble();
        System.out.println("Kola şişesinin fiyatını girin: ");
        double kolaSisesiFiyati= scanner.nextDouble();
        final double Paketteki_kola_kutusu_adedi = 6;
        final double Kutu_Hacmi = 0.355;
        final double Sise_Hacmi = 2;

        double kolaKutuLitreFiyati = paketFiyati / (Paketteki_kola_kutusu_adedi * Kutu_Hacmi);
        double kolaSisesiLitreFiyati = kolaSisesiFiyati / Sise_Hacmi;

        System.out.printf("Paket litre fiyatı: %8.2f", kolaKutuLitreFiyati);
        System.out.println();
        System.out.printf("Şişe litre fiyatı: %9.2f", kolaSisesiLitreFiyati);
    }
}
