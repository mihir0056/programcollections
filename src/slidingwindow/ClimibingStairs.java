package slidingwindow;

public class ClimibingStairs {

    public static int[][] convertToZero(int[][] arr){

        boolean rowHasZero = false;
        boolean columnHasZero = false;

        //find first row has zero
        for(int j=0;j<arr[0].length;j++){
            if(arr[0][j] == 0){
                rowHasZero = true;
                break;
            }
        }

        //find first column has zero
        for(int i=0;i<arr.length;i++){
            if(arr[i][0] == 0){
                columnHasZero = true;
            }
            break;
        }

        //check for zeros in the rest of the array
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                if(arr[i][j] == 0){
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        //nullify rows based on values in first column
        for(int i=1;i<arr.length;i++){
            if(arr[i][0] == 0){
                nullifyRow(arr,i);
            }
        }

        //nullify rows based on values in first column
        for(int i=1;i<arr[0].length;i++){
            if(arr[0][i] == 0){
                nullifyCol(arr,i);
            }
        }

        if(rowHasZero){
            nullifyRow(arr,0);
        }

        if(columnHasZero){
            nullifyCol(arr,0);
        }

        return arr;


    }

    public static void nullifyRow(int[][] arr,int i){
        for(int col=0; col<arr.length; col++){
            arr[i][col] = 0;
        }
    }

    public static void nullifyCol(int[][] arr, int i){
        for(int row=0; row<arr[0].length; row++){
            arr[row][i] = 0;
        }
    }


    public static void main(String args[]){
        int arr[][] = new int[][]{{1,2,3},{4,0,6},{7,8,9},{2,0,7}};

        ClimibingStairs.convertToZero(arr);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
