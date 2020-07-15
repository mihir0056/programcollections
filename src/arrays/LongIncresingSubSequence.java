package arrays;
/*
Example 1:
Input: [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3.
Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4.
 */
public class LongIncresingSubSequence {

    public static int findLengthOfLCIS(int[] nums) {

        int longestSub = 1;
        int end = nums.length-1;
        int start = 0;
        int j = 1;
        int max = 0;

      while(start < end && j < end){
          if(nums[j] > nums[start]){
              j++;
              longestSub++;
              if(longestSub > max){
                  max = longestSub;
              }
          }
          start++;
          j++;
          if(longestSub > max){
              max  = longestSub;
          }

        }

      return max;
    }

    public static void main(String args[]){
        System.out.println(LongIncresingSubSequence.findLengthOfLCIS(new int[]{1,3,5,4,7}));
        System.out.println(LongIncresingSubSequence.findLengthOfLCIS(new int[]{2,2,2,3,2}));
        System.out.println(LongIncresingSubSequence.findLengthOfLCIS(new int[]{1,3,5,7}));
    }

}
