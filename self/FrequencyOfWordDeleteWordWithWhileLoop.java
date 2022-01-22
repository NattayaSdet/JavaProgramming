package self;

public class FrequencyOfWordDeleteWordWithWhileLoop {

    public static void main(String[] args) {

        System.out.println(frequencyOfWordWhileLoopDelete("Cat, CAt, Dog, DOG"));


    }

   public static int frequencyOfWordWhileLoopDelete(String str){

        String sentence = str.toLowerCase();

        int countCat = 0;

       while(sentence.contains("cat")){

           sentence = sentence.replaceFirst("cat", "");

           countCat++;

       }
       return countCat;
   }
}
