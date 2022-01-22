package self;

import java.util.ArrayList;

public class ExtractSpecialDigitsLettersArrayList {

    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

//create a new chars object from String str, use forLoop and add method
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i< str.length(); i++) {
            chars.add(str.charAt(i));
        }
//create a new letters object
        ArrayList<Character> letters = new ArrayList<>(chars);
        letters.removeIf(p -> !Character.isLetter(p));
        System.out.println("Letters: "+ letters);


        ArrayList<Character> digits = new ArrayList<>(chars);
        digits.removeIf(p-> !Character.isDigit(p));
        System.out.println("Digits: " +digits);

        ArrayList<Character> specialChar = new ArrayList<>(chars);
        specialChar.removeIf(p->Character.isLetterOrDigit(p));
        System.out.println("Special characters: "+specialChar);


    }
}
/*
3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
				Ex:
					str = "ABCD123$%#@&456EFG!"
				output:
					list1: {1, 2, 3, 4, 5, 6}
					list2: {A, B, C, D, E, F, G}
					list3: {$, %, #, @, &, !}
 */
