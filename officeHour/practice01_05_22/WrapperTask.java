package practice01_05_22;

import java.util.Collections;

public class WrapperTask {

    public static void main(String[] args) {

    /*(WrapperTask)

        Task :
     String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
     Write a method that returns : Welcome To Core Java

      */

        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
        String result ="";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))){
                result += " "; //as soon as you see uppercase, put empty space immediately
            }
            if(Character.isAlphabetic(str.charAt(i))){
                result += str.charAt(i);
            }
        }
        System.out.println(result.trim());

    }
}
