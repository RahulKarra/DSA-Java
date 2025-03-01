package LeetcodeQuestions;

import java.util.HashSet;

public class ContainsDuplicateII {
    public static void main(String[] args) {

        int[] array = {1,2,3,1};
        int k = 1;
        boolean ans = containsNearbyDuplicate(array,k);
        System.out.println(ans);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i< nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }

            set.add(nums[i]);

            if(set.size() > k){
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
