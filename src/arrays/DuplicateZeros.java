package arrays;

public class DuplicateZeros {

    /*
    Input: [1,0,2,3,0,4,5,0]
    Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
     */
    public static int[] duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length_ = arr.length - 1;

        // Find the number of zeros to be duplicated
        // Stopping when left points beyond the last element in the original array
        // which would be part of the modified array
        for (int left = 0; left <= length_ - possibleDups; left++) {

            // Count the zeros
            if (arr[left] == 0) {

                // Edge case: This zero can't be duplicated. We have no more space,
                // as left is pointing to the last element which could be included
                if (left == length_ - possibleDups) {
                    // For this zero we just copy it without duplication.
                    arr[length_] = 0;
                    length_ -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        // Start backwards from the last element which would be part of new array.
        int last = length_ - possibleDups;

        // Copy zero twice, and non zero once.
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }

        return arr;
    }

    public static void main(String args[]){
        int arr[] = DuplicateZeros.duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
        for(int i:arr){
            System.out.print(i);
        }
    }

}
