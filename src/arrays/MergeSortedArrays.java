package arrays;

public class MergeSortedArrays {

    /*
    Input:
    nums1 = [1,2,3,0,0,0], m = 3
    nums2 = [2,5,6],       n = 3

    Output: [1,2,2,3,5,6]
     */
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int arr1 = m-1;
        int arr2 = n-1;
        int arrLength = m+n-1;

        for(int i=arr1;i>=0;i--){
            for(int j=arr2;j>=0;j--){
                if(nums1[i] > nums2[j]){
                    nums1[arrLength--] = nums1[i];
                    arr1--;
                    continue;
                }else{
                    nums1[arrLength--] = nums2[j];
                    arr2--;
                    continue;
                }
            }

        }

        return nums1;
    }

    public static int[] merge1(int[] nums1, int m, int[] nums2, int n) {
        int totalLength = m+n-1;

        while (m > 0 && n > 0) {
            if (nums1[m-1] >= nums2[n-1]) {
                nums1[m+n-1] = nums1[m-1];
                m--;
            } else {
                nums1[m+n-1] = nums2[n-1];
                n--;
            }
        }

        while(n > 0){
            nums1[m+n-1] = nums2[n-1];
            n--;
        }

        return nums1;
    }

    public static void main(String args[]){

        //int result[] = MergeSortedArrays.merge1(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);

        int result[] = MergeSortedArrays.merge1(new int[]{0,0},0,new int[]{2,5},2);

        for(int i:result){
            System.out.print(i);
        }
    }
}
