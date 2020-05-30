package arrays;

public class FindEvenNumbersDigits {

    /*
    Input: nums = [12,345,2,6,7896]
    Output: 2
    Explanation:
    12 contains 2 digits (even number of digits).
    345 contains 3 digits (odd number of digits).
    2 contains 1 digit (odd number of digits).
    6 contains 1 digit (odd number of digits).
    7896 contains 4 digits (even number of digits).
    Therefore only 12 and 7896 contain an even number of digits.
     */
    public static int findNumbers(int[] nums) {

        int evenCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int num = nums[i];
            while (num != 0) {
                num = num / 10;
                ++count;

            }
            if (count % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;

    }

    public static void main(String args[]){
        //int arr[] = {12,345,2,6,7896};
        int arr[] = {555,901,482,1771};
        System.out.println(FindEvenNumbersDigits.findNumbers(arr));
    }
}
