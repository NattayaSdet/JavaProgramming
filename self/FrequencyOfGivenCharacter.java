package self;

public class FrequencyOfGivenCharacter {
    public static void main(String[] args) {

        System.out.println(frequencyOfChar("AAABBBCDEZ"));

    }

    public static int frequencyOfChar(String str){

        char ch ='A';
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            if(ch!=eachChar){
                continue;

            }else{
                frequency++;
            }

        }
        return frequency;
    }



}
