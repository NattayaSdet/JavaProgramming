public class FrequencyOfChar {
    public static void main(String[] args) {

        String str = "Java Java java";
        String tarGetChar = "a";
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            String ch = ""+ str.charAt(i);

            if(tarGetChar.equalsIgnoreCase(ch)){
                frequency++;
            }


        }
        System.out.println(frequency);
    }
}
