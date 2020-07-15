package sorting;

public class MergeSort {

    public static void mergeSort(int[] arr, int n){
        if(arr.length <= 1){
            return;
        }
        int mid = n/2;
        int[] L = new int[mid];
        int[] R = new int[arr.length - mid];

        //initialize L array
        for(int i=0;i<mid;i++){
            L[i] = arr[i];
        }

        //intialize R array
        for(int i=mid;i<arr.length;i++){
            R[i-mid] = arr[i];
        }

        mergeSort(L,mid);
        mergeSort(R,n-mid);

        merge(arr,L,R,mid,n-mid);

    }

    public static void merge(int[] arr, int[] L,int[] R, int left, int right){
        int i=0,j=0,k=0;
        while(i < left && j < right){
            // if left is less than right
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
                //if left is greater than right
            } else {
                arr[k++] = R[j++];
            }
        }

        //itterate over left array and put elements
        while (i < left) {
            arr[k++] = L[i++];
        }

        //itterate over right index and put in array
        while (j < right) {
            arr[k++] = R[j++];
        }

    }

    public static void printArray(int[] arr){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String args[]){

        int[] arr = new int[]{2,5,5,7,8,6,0};
        MergeSort.mergeSort(arr,7);
        MergeSort.printArray(arr);
    }
}
