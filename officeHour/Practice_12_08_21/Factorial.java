package Practice_12_08_21;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = input.nextInt();
        int result = 1;

        if (number > 2) {
            for (int i = number; i >= 1; i--) {
                result *= i;
            }
        }else{
            result = number;
        }
        System.out.println(result);


    }
}
