public class DoWhileLoop {
    public static void main(String[] args) {
        int sum = 0, num = 1;
        do {
            sum += num;
            num++;
        } while (sum <= 5000);

        System.out.println(sum);
    }
}
