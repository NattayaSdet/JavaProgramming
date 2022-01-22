package Mentor;

import java.util.ArrayList;

public class AnagramWithoutSort {

    public static boolean isAnagram(String str, String str1){
        // str=listen  str1=silent

        //

        // convert the two string in an array list
        ArrayList<Character> list1=new ArrayList<>();  //{s, i, l}
        ArrayList<Character> list2=new ArrayList<>();

        if(str.length()!=str1.length())
            return false;

        for (int i = 0; i < str.length(); i++) {
            list1.add(str.charAt(i));
            list2.add(str1.charAt(i));
        }

        if(list1.containsAll(list2))
            return true;
        else
            return true;

        // we will use containsALl to determine if all members are in both arrays.
        // return the result


    }
}
