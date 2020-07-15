package arrays;

import java.util.HashSet;

public class TwoSum {

    /*
    2,3,4,5,6
     */
    public static void twoSum(int[] nums, int target) {

        HashSet<Integer> set = new HashSet<Integer>();

        int sum = 0;
        int tartgetSum= target;

        for(int i=0;i<nums.length;i++){
            if(set.contains(tartgetSum - nums[i])){
                System.out.println(set);
            }else{
                set.add(nums[i]);
                //tartgetSum = tartgetSum - nums[i];
            }
        }

    }

    public static void main(String args[]){

        TwoSum.twoSum(new int[]{2,3,5,8,9,1},8);

    }
}
