public class ReversedSentence {
    public static void main(String[] args) {

        String sentence = "I love Java";

        String[] words = sentence.split(" "); //{"I", "love", "Java}
                                                    // 0      1        2  --> i
                                                    // 2       1       0 --> j


        String[] reversed = new String[words.length];       //--> answer

        for (int i = words.length-1 , j= 0 ; i >=0 ; i--, j++) {
            reversed[j] = words[i];

        }
        System.out.println(reversed);

    }
}
