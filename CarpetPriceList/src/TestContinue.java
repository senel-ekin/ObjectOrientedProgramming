public class TestContinue {
    public static void main(String[] args) {
        System.out.print("                          " + "LENGTH");
        System.out.println();
        System.out.print("        ");

        for (int i = 5; i <= 25; i += 5)
            System.out.printf("%8d", i);

        for (int n = 11; n <= 20; n += 1) {
            if (n == 15){
                System.out.print("\nWIDTH   " + n);
                for (int b = 5; b <= 25; b += 5) {
                    System.out.printf("%8d", n * b * 15);
                }
                continue;
            }
            System.out.println();
            System.out.printf("%10d", n);
            for (int b = 5; b <= 25; b += 5) {
                System.out.printf("%8d", n * b * 15);
            }
        }
    }
}
