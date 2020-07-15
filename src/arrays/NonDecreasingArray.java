package arrays;

/*
Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.

We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).

Input: nums = [4,2,3]
Output: true
Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
 */
public class NonDecreasingArray {

    public static boolean checkPossibility(int[] nums) {

        int atMost = 0;

        for(int i=1;i<nums.length && atMost <= 1;i++){

            if(nums[i-1] > nums[i])
            {
                atMost++;
                if(i-2 < 0 || nums[i-2] <= nums[i]){
                    nums[i-1] = nums[i];
                }else{
                    nums[i] = nums[i-1];
                }
            }
        }
        return atMost<=1;
    }

    public static void main(String args[]){
        System.out.println(NonDecreasingArray.checkPossibility(new int[]{4,2,1}));
    }
}
