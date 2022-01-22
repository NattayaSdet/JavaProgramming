package self;

public class frequencyOfWord {

    public static void main(String[] args) {

        System.out.println(frequencyOfWord("JavaJavaJava"));

    }


    public static int frequencyOfWord(String str){

        String word = "Java";

        int frq = 0;

        for (int i = 0; i < str.length()-4; i++) {

            String eachWord = str.substring(i, i+4);

            if(word.equals(eachWord)){
                frq++;
            }

        }
        return frq;
    }
}
