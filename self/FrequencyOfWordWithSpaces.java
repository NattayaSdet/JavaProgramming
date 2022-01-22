package self;

public class FrequencyOfWordWithSpaces {

    public static void main(String[] args) {

        System.out.println(frequencyOfWordWithSpaces("Cat Cat Dog Dog cAt CAT caT"));
    }

    public static int frequencyOfWordWithSpaces(String str){

        String word ="Cat";

        int frq = 0;

        for (int i = 0; i < str.length()-3; i++) {

            String eachSub = str.substring(i, i+3);

            if(word.equalsIgnoreCase(eachSub)){
                frq++;
            }

        }
        return frq;
    }
}
