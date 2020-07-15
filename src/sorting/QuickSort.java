package sorting;

public class QuickSort {


    public static void quickSort(int[] arr, int start, int end){
            if(start >= end) return ;
            int pivot = partition(arr,start,end);
            //System.out.println(partionIndx);
            quickSort(arr,start,pivot);
            quickSort(arr,pivot+1,end);
    }

    public static int partition(int[] arr,int start,int end){
        int pivot = arr[start];
        while(start < end) {
            while (start < end && arr[end] >= pivot) end--;
            Swap(arr, start, end);
            while (start < end && arr[start] <= pivot) start++;
            Swap(arr, end, start);
        }
        arr[start] = pivot;
        System.out.println(start + " : "+arr[start]);
        return start;
    }

    public static void Swap(int[] nums, int lhs, int rhs) {
        int temp = nums[lhs];
        nums[lhs] = nums[rhs];
        nums[rhs] = temp;
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }


    //merge sort

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }

        // take mid value
        int mid = n / 2;

        //create left array
        int[] l = new int[mid];

        //create right array
        int[] r = new int[n - mid];

        //initialize left array
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }

        //intialize right array
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }

        //merge sort left array
        mergeSort(l, mid);

        //merger sort right array
        mergeSort(r, n - mid);

        //merge the result of left and right
        merge(a, l, r, mid, n - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            // if left is less than right
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            //if left is greater than right
            } else {
                a[k++] = r[j++];
            }
        }

        //itterate over left array and put elements
        while (i < left) {
            a[k++] = l[i++];
        }

        //itterate over right index and put in array
        while (j < right) {
            a[k++] = r[j++];
        }
    }


    public static void main(String args[]){
        int[] arr = new int[]{7,0,5,6,3,2,1,4};
       QuickSort.quickSort(arr,0,7);
        printArray(arr);

    }
}
