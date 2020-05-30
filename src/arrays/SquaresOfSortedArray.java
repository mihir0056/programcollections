package arrays;

public class SquaresOfSortedArray {
    /*
    Input: [-4,-1,0,3,10]
    Output: [0,1,9,16,100]

    Input: [-7,-3,2,3,11]
    Output: [4,9,9,49,121]
     */

    // sorted array . find out index for highest negative number and start storing
    public static int[] sortedSquares(int[] A) {
        int N = A.length;
        int positiveCounter = 0;
        while (positiveCounter < N && A[positiveCounter] < 0)
            positiveCounter++;
        int negativeCounter = positiveCounter - 1;

        int[] ans = new int[N];
        int t = 0;

        while (negativeCounter >= 0 && positiveCounter < N) {
            if (A[negativeCounter] * A[negativeCounter] < A[positiveCounter] * A[positiveCounter]) {
                ans[t++] = A[negativeCounter] * A[negativeCounter];
                negativeCounter--;
            } else {
                ans[t++] = A[positiveCounter] * A[positiveCounter];
                positiveCounter++;
            }
        }

        while (negativeCounter >= 0) {
            ans[t++] = A[negativeCounter] * A[negativeCounter];
            negativeCounter--;
        }
        while (positiveCounter < N) {
            ans[t++] = A[positiveCounter] * A[positiveCounter];
            positiveCounter++;
        }

        return ans;

    }

    public static void main(String args[]) {

        int arr[] = {-7, -3, 0, 3, 11};
        int result[] = SquaresOfSortedArray.sortedSquares(arr);

        for (int i : result)
            System.out.println(i);
    }
}
