package arrays;

import java.util.HashSet;

public class TwoSum {

    /*
    2,3,4,5,6
     */
    public void twoSum(int[] nums, int target) {

        HashSet<Integer> set = new HashSet<Integer>();

        int sum = 0;

        for(int i=0;i<nums.length;i++){
            if(set.contains(target - nums[i])){

            }else{
                set.add(i);
            }
        }

    }

    public static void main(String args[]){

    }
}
