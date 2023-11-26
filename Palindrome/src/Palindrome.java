import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        if(isPalindrome(word)) {
            System.out.println(word + " is a palindrome word.");
        }
        else {
            System.out.println(word + " is not a palindrome word.");
        }
    }

    private static boolean isPalindrome(String word){
        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord += word.charAt(i);
        }
        return word.equals(reverseWord);
    }
}
