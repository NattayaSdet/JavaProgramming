package day26_CustomMethodsPractice;

import java.util.Arrays;

import static utilities.ArraysUtility.reverse;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int[] result = reverse(arr);

        System.out.println(Arrays.toString(result));

    }
}
