import java.util.Arrays;

public class MovingZeros {

    public static void main(String[] args) {


        int[] nums = {1, 0, 0, 2, 0, 0, 3};

        int[] result = new int[nums.length];

        int i =0;
        for (int each:nums){
            if(each!=0){
                result[i] = each; //1,2,3,...
                i++;

            }

        }
        System.out.println(Arrays.toString(result));

    }
}
