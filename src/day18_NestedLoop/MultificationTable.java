package src.day18_NestedLoop;

public class MultificationTable {

    public static void main(String[] args) {


        for (int j = 1; j <= 10; j++) {


            for (int i = 1; i <= 10; i++) {
                System.out.print((j * i) + " \t");
            }
            System.out.println();

        }
    }
}
