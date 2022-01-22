public class Fibonacci {
    public static void main(String[] args) {
        // 1 1 2 3 5 8 13 21   6th->8  7th->13  8th->21
        int n=1,m=1,result=0;


        for (int i = 2; i < 8; i++) {
            result=n+m;
            n=m;
            m=result;

        }
        System.out.println(result);
    }
}
