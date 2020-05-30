package arrays;

public class ContainerWithMostWater {

    /*
    Input: [1,8,6,2,5,4,8,3,7]
    Output: 49
     */
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int start = 0;
        int end = height.length-1;

        while(start < end){
            int area = (end - start) * Math.min(height[start],height[end]);

            if(area > maxArea){
                maxArea = area;
            }

            if(height[start] < height[end]){
                start++;
            }else if(height[start] > height[end]){
                end--;
            }else{
                start++;
                end--;
            }
        }
        return maxArea;
    }

    public static void main(String args[]){
       //System.out.println(ContainerWithMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(ContainerWithMostWater.maxArea(new int[]{1,8,4,2,5,4,8,3,1}));
    }

}
