package self;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveAllZerosToTheEndArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,0,2,0,3,0,4));
        System.out.println(numbers);

        int size = numbers.size();
        System.out.println("Old size is "+size);

        numbers.removeAll(Arrays.asList(0));
        System.out.println(numbers);

        int newSize = numbers.size();
        System.out.println("New size is: " + newSize);

        int zeros = size-newSize;
        System.out.println("Number of zeros is: "+ zeros);

        for (int i = 0; i < zeros ; i++) {
            numbers.addAll(Arrays.asList(0));

        }
        System.out.println("Result arrays is: " +numbers);
    }

}
/*
2. Write a program that can move all the zeros to the last indexes of ArrayList
					Ex:
						list: {1,0,2,0,3,0,4,0}
					output:
						[1, 2, 3, 4, 0, 0, 0, 0]
 */
