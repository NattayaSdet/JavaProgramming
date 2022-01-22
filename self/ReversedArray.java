import java.util.Arrays;

public class ReversedArray {

    public static void main(String[] args) {

        String[] words = {"Java", "Python", "C++"};
               //            0       1       2   index of i
                //           2       1       0   index of j

        String[] reversed = new String[words.length];
        for (int i = words.length - 1, j= 0; i >= 0; i--, j++) {

            reversed[j] = words[i];

        }
        System.out.println(Arrays.toString(reversed));

    }
}
