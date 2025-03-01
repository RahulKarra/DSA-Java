package Learn_Java.src.Java_practice;

public class Two_sum_Arrays {
    public static void main(String[] args) {


    }


    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <nums.length; i++) {
            for (int j = 1; j < nums.length ; j++) {

                if (nums[i] + nums[j] == target)
                {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No sum solution");
    }
}

