package arrays;

public class FindMinRotatedSortedArray {

    /*public static int findMin(int[] nums) {

        int pivot = (nums.length-1)/2 ;
        int start = 0;
        int end = 0;

        if(nums.length == 1){
            return nums[0];
        }

        if(nums.length == 2){
            return Math.min(nums[0],nums[1]);
        }

        //System.out.println(pivot);
        if(nums[pivot-1] > nums[pivot+1]){
            start = pivot;
            end = nums.length -1;
        }else{
            start = 0;
            end = pivot;
        }

        int min = nums[start];
        //System.out.println(start);
        //System.out.println(end);

        int j = start+1;
        while(j <= end ){
            int temp = Math.min(nums[start],nums[j]);
            min = Math.min(min,temp);
            //System.out.println(min);
            if(nums[start] < nums[j]){
                start = start+1;
            }
            j = j + 1;
        }

        //System.out.println(min);
        return min;
    }*/

    /*public static int findMin(int[] nums) {
        int pivot = (nums.length-1)/2 +1;

        while(pivot < nums.length-1){

        }
    }*/

    public static void main(String arr[]){
        //System.out.println(FindMinRotatedSortedArray.findMin(new int[]{4,5,6,7,0,1,2}));
        //System.out.println(FindMinRotatedSortedArray.findMin(new int[]{7,0,1,2,4,5,6}));
        //System.out.println(FindMinRotatedSortedArray.findMin(new int[]{3,4,5,1,2}));
        //System.out.println(FindMinRotatedSortedArray.findMin(new int[]{1,2,3}));
    }

}
