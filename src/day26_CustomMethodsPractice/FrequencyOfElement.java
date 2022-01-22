package day26_CustomMethodsPractice;

import static utilities.ArraysUtility.frequencyOfElement;

public class FrequencyOfElement {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 11, 1, 2, 2, 3, 3, 3, 4, 4, 1, 1, 1, 1};

        int n = frequencyOfElement(arr, 1);

        System.out.println(n);


    }
}
