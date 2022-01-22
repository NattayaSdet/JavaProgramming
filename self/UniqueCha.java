package self;

public class UniqueCha {

    public static void main(String[] args) {

        String str = "aabbbcccde";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);

            int count=0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);

                if(ch==each){
                    count++;
                }

            }
            if(count!=1){
                continue;
            }else{
                result += ch;
            }

        }
        System.out.println(result);
    }
}