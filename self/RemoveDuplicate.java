package self;

public class RemoveDuplicate {

    public static void main(String[] args) {


        System.out.println(removeDup("AABBBCCCD"));

    }

    public static String removeDup(String str){

        String result="";

        for (int i = 0; i < str.length(); i++) {
            String ch =""+str.charAt(i); //AABBBC
                  //A
            if(result.contains(ch)){
                continue;
            }
            result += ch; //ABCD

        }
        return result;
    }


}
