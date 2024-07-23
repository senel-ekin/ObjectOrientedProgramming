import java.util.*;
class TestAddressBook {
    public static void main(String[] args) {
        AddressBook   myBook;
        String        inputStr;
        int           size;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Array size: ");
            inputStr = scanner.next();

            if (inputStr.equalsIgnoreCase("stop")) {
                break;
            }
            size = Integer.parseInt(inputStr);

            try {
                myBook = new AddressBook(size);
            } catch (IllegalArgumentException e) {
                System.out.println("Exception Thrown: size = " + size);
            }
        }
    }
}
