package tree;

public class BinarySearch {
    public static int searchInt(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }

        if(arr.length == 1){
            if(arr[0] == target){
                return 0;
            }
        }

        int start = 0;
        int end = arr.length -1 ;

        while(start <= end){
            int mid = start + (end -start)/2;

            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        System.out.println(BinarySearch.searchInt(new int[]{-2,-1,1,3,5,6,9,10},11));
    }
}
