public class WhileLoop {
    public static void main(String[] args){
        int sum = 0, num = 1;
        while(true) {
            sum += num;
            num++;
            if (sum > 5000) break;
        }

        System.out.println(sum);

    }
}
