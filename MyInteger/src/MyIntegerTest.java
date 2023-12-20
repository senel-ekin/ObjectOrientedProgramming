public class MyIntegerTest {
    public static void main(String[] args) {
        MyInteger myInteger1 = new MyInteger(6);
        MyInteger myInteger2 = new MyInteger(3);

        System.out.println(myInteger1.getValue());
        System.out.println(myInteger1.isEven());
        System.out.println(myInteger1.isOdd());
        System.out.println(myInteger1.isPrime());

        System.out.println(myInteger2.getValue());
        System.out.println(myInteger2.isEven());
        System.out.println(myInteger2.isOdd());
        System.out.println(myInteger2.isPrime());
    }
}
