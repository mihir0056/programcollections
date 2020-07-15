package arrays;

public class KadaneMaxSum {

    public static int maxSum(int[] arr){

        if(null == arr || arr.length == 0 ){
            throw new IllegalArgumentException("array is null or empty");
        }

        int maxSum = arr[0];
        int maxPrev = arr[0];

        for(int i=1;i<arr.length;i++){

            maxPrev = Math.max(maxPrev + arr[i], arr[i]);

            maxSum = Math.max(maxSum,maxPrev);
        }

        return maxSum;
    }

    public static void main(String args[]){
        System.out.println(KadaneMaxSum.maxSum(new int[]{1,-1,3,4,5,-5,-6}));
    }
}
