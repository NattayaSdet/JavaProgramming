package self;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        System.out.println(calculator(2,2,'+'));

    }

    public static int calculator(int n1, int n2, char operator){

        int result = 0;

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter a number");

        int num1 = scan.nextInt();

        System.out.println("Enter a number");

        int num2 = scan.nextInt();

        System.out.println("Enter an operator");

        char op = scan.next().charAt(0);


        while(!(op== '+' || op == '-')){
            System.out.println("Invalid operator, enter a new operator");
            op = scan.next().charAt(0);
        }
        result = (op=='+' || op =='-') ? n1+n2 : n1-n2;


        return result;

    }
  
}
