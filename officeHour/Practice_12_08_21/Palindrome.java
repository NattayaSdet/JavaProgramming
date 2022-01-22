package Practice_12_08_21;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.nextLine();
        String result = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            result += word.charAt(i);
        }
        boolean isPalindrome = word.equalsIgnoreCase(result);
        System.out.println(isPalindrome);


    }
}
