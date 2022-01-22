package day41_Exceptions;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        //unchecked exception

        int a = 10;
        int b = 0;

      //  System.out.println(a/b); // ArithmeticException - unchecked - runtime

        char[] characters = {'A', 'B', 'C'};

       // System.out.println(99);  // ArrayIndexOutOfBoundsException- unchecked - runtime

        day39_recap.Cydeo.Student student = null;

       // System.out.println(student.getName());
        String str2 = "";  // object != null
        System.out.println(str2.isEmpty());


        // checked Exception:

        System.out.println("Hello");

        //   Thread.sleep(3000); // checked

        System.out.println("Cydeo");


        // FileInputStream file = new FileInputStream("path of the file");

        System.out.println("Java".charAt(1000)); // unchecked






    }
}
