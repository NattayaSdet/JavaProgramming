public class ReversedString {
    public static void main(String[] args) {

        String str = "Java";
                    //0123  --> index i
                    //3210  --> reversed

        String reversed = "";

        for (int i = str.length()-1; i >= 0 ; i--) { // avaJ
            reversed += str.charAt(i);

        }
        System.out.println(reversed);

    }
}
