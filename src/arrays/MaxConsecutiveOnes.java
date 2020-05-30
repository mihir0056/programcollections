package arrays;

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int consecutiveCount = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                consecutiveCount = consecutiveCount + 1;

            }
            if (nums[i] == 0 || (i == (nums.length - 1))) {
                if (consecutiveCount > max) {
                    max = consecutiveCount;
                }
                consecutiveCount = 0;
            }
        }

        return max;
    }

    /*
    input = [1] = 1
    [1,0,1,1,0,1] = 2
    [1,1,0,1,1,1,0] = 3
     */
    public static void main(String args[]) {
        int arrs[] = {1};
        System.out.println(MaxConsecutiveOnes.findMaxConsecutiveOnes(arrs));
    }
}
