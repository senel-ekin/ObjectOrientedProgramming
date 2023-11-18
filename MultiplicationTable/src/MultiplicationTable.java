public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("          Multiplication Table");
        System.out.print("   ");
        for (int i = 1; i < 10; i++)
            System.out.print("   " + i);
        System.out.println();
        System.out.println("---------------------------------------");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + "| ");
            for (int j = 1; j < 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
