package slidingwindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianValueList {

    public static double[] medianSlidingWindow(int[] nums, int k) {
        List<Double> medianList = new ArrayList<Double>();



        for(int i=0,j=i+k-1;j<nums.length;i++,j++){
            double temp = findMedian(nums,i,j);
            medianList.add(temp);
        }

        double x[] = new double[medianList.size()];
        for(int i = 0; i < x.length; i++){
            x[i] = medianList.get(i);
        }


        return x;
    }

    public  static double findMedian(int[] nums,int start,int end){
        List<Integer> arr = new ArrayList<Integer>();

        for(int i=start;i<=end;i++){
            arr.add(nums[i]);
        }

        Collections.sort(arr);

        double median = 0;

        if(arr.size()%2 == 0){
            int temp = arr.size()/2 - 1;
            median = ((double)arr.get(temp) + (double)arr.get(temp+1))/2d;
        }else{
            median = arr.get(arr.size()/2);
        }

        return median;

    }

    public static void main(String args[]){
        double[] output = MedianValueList.medianSlidingWindow(new int[]{2147483647,2147483647},2);
        for(double i : output){
            System.out.print(i);
        }


    }
}
