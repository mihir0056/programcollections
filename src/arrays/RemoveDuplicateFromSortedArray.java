package arrays;

public class RemoveDuplicateFromSortedArray {

    /*
    Given nums = [0,0,1,1,1,2,2,3,3,4],
    output = 0,1,2,3,4 length = 5
     */
    public static int removeDuplicates(int[] nums) {

        int length = 0;
        int i = 0;
        int j = 1;

        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return 1;
        }

        while (i < nums.length && j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }

        return i + 1;
    }

    public static void main(String args[]) {

        int[] arr = new int[]{1, 2, 2, 2, 4, 5};
        int length = RemoveDuplicateFromSortedArray.removeDuplicates(arr);
        for(int i = 0;i<length;i++){
            System.out.print(arr[i]);
        }
    }
}
