package tree;

public class BinarySearchMinCyclic {
    public static int searchInt(int[] arr){
        int target = arr[arr.length-1];

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

            if(arr[mid] <= arr[mid+1] && (arr[mid] == 0 || arr[mid] <= arr[mid -1])){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        System.out.println(BinarySearchMinCyclic.searchInt(new int[]{2}));
    }
}
