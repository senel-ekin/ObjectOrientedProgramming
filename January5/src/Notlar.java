public class Notlar {
    public static void main(String[] args) {
        char[][] yanitlar = {{'A', 'B', 'A', 'C'}, {'D', 'B', 'A', 'B'},
                {'E', 'D', 'D', 'A'}, {'C', 'B', 'A', 'E'}, {'A', 'B', 'D', 'C'}};
        char[] anahtarlar = {'D', 'B', 'D', 'C'};
        for (int i = 0; i < yanitlar.length; i++) {
            int dogruYanitSayisi = 0;
            for (int j = 0; j < yanitlar[i].length; j++) {
                if (yanitlar[i][j] == anahtarlar[j])
                    dogruYanitSayisi++;
            }
            System.out.println(i + ". öğrenci doğru yanıt sayısı: " + dogruYanitSayisi);
        }
    }
}
