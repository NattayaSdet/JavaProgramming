package practice_12_29_21;

import java.util.Arrays;

public class MultipleWords {
    public static void main(String[] args) {

        String words = "knife, wooden spoon, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

        String[] splitArr = words.split(", ");

        System.out.println(Arrays.toString(splitArr));

        for (String eachWord: splitArr) {
            if(eachWord.contains(" ")){
                System.out.println(eachWord);
            }
        }




    }
}
