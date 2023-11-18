public class CarpetPriceListTable {
    public static void main(String[] args) {
        System.out.print(" ");
        for (int i = 5; i <= 25; i+=5)
            System.out.printf("%8d", i);

        //print out rows of prices
        for (int n = 5; n <= 14; n+=1) {
            System.out.println();
            System.out.printf("%2d", n);
            for (int b = 5; b <= 25; b+=5)
                System.out.printf("%8d", n * b * 15); //unit price $15
        }
    }
}
