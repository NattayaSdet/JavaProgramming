package self;

public class FrequencyOfManyCharactersNestedLoop {

    public static void main(String[] args) {

        String str ="aabbcccddddd";
        String result ="";

        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i); //aabbcccddddd

            int count=0;
            for (int j = 0; j < str.length() ; j++) { //if there is j in the Loop, tell me how many js are there
                char each = str.charAt(j);

                if(ch==each){
                    count++;
                }


            }
            if(result.contains(""+ch)){
                continue;
            }
            result += ch;
            result += count;
        }
        System.out.println(result);
    }
}