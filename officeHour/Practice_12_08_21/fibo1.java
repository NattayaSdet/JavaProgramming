package Practice_12_08_21;

import java.util.Arrays;

public class fibo1 {

    public static void main(String[] args) {

     /*Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers

	 Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st fibonacci is 1, 2nd fibonacci is 1, etc..
		       Ex:
		       Input:
		       8
			   Output:
			   0, 1, 1, 2, 3, 5, 8, 13
				             index       Values
				              0           0
				              1           1
				              2           1     index0+index1
				              3           2     index1+index2
				              4           3     index2+index3
				              5           5
				              6           8
				              7           13
				         */

        int number = 8;

        int[] fibo = new int[number];

        fibo[0] = 0;
        fibo[1] = 1;

        for(int i = 2; i < number ; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
            //  fibo[2]=fibo[1] + fibo[0] = 1
            //  fibo[3]=fibo[2] + fibo[1] = 1+1=2

        }
        System.out.println(Arrays.toString(fibo));

    }

    }

