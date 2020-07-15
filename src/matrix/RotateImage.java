package matrix;
/*
Given input matrix =
[
    00 01 02
    [1, 2,3],
  10[4, 5,6],
  20[7, 8,9]
],

rotate the input matrix in-place such that it becomes:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]
 */
public class RotateImage {

    public static void rotate(int[][] matrix) {
        int matrixLen = matrix.length;

        for(int i=0;i<matrixLen/2;i++){
            for(int j=i;j<matrixLen-1-i;j++){
                int temp1 = matrix[i][j]; //1
                matrix[i][j] = matrix[matrixLen-j-1][i]; // 1 --> 7
                //matrix[matrixLen-j-1][i] = matrix[]              // 7 --> 9



            }
        }

    }

    public static void main(String args[]){
        int arr[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    }
}
