public class array {
    public static void main(String[] args) {
        char[] karakterler = diziOlustur();
        diziYazdir(karakterler);
        System.out.println("");
        int[] diziYeni = karakterleriSay(karakterler);
        diziYazdir(diziYeni);
    }

    public static char[] diziOlustur() {
        char[] karakterler = new char[100];
        for (int i = 0; i < karakterler.length; i++) {
            karakterler[i] = (char)('a' + Math.random()*('z' - 'a' + 1));
        }
        return karakterler;
    }

    public static void diziYazdir(char[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
    }

    public static void diziYazdir(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
    }

    public static int[] karakterleriSay(char[] dizi) {
        int[] yeniDizi = new int[26];
        for (int i = 0; i < dizi.length; i++) {
            yeniDizi[dizi[i] - 'a']++;
        }
        return yeniDizi;
    }
}
