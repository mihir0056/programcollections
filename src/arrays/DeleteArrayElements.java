package arrays;

import java.util.LinkedList;

public class DeleteArrayElements {

    public static int[] removeElement(int[] nums, int val) {
        int length = 0;
        int arrLength = nums.length -1 ;

        /*for(int i=0;i<nums.length;i++){
            for(int j=arrLength;j>0;j--){
                if(nums[i] == val && nums[j] == val){
                    j--;
                }else if(nums[i] == val && nums[j] != val){
                    nums[i] = nums[j];
                    i++;
                    j--;
                    length++;
                }else{
                    i++;
                   // j++;
                }
            }
        }*/

        int start = 0;
        int end = arrLength;
        int i = start;
        int j = end;

        while (i >= start  && j <= end){
            if(i > j){
                break;
            }

            if(nums[i] == val && nums[j] == val){
                j--;
            }else if(nums[i] == val && nums[j] != val){
                nums[i] = nums[j];
                i++;
                j--;
                length++;
            }else{
                i++;
                // j++;
                length++;
            }
        }

        System.out.println(length);
        return nums;
    }


    public static void main(String args[]){
        int arr[] = DeleteArrayElements.removeElement(new int[]{1,3,2,2,2,4},3);

        for(int i:arr){
            System.out.print(i);
        }


    }

}
