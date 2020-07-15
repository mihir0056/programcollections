package recurssionbacktracking;

import com.sun.tools.javac.util.Pair;

import java.util.Arrays;

public class MazeProblem {

    static int possiblePaths = 0;
    public enum State{
        UNVISITED,
        VISITING,
        NO_PATH
    }

    public static boolean pathExists(int[][] arr){
        if(arr == null || arr.length == 0){
            return false;
        }

        State[][] memo = new State[arr.length][arr[0].length];

        for(State[] states: memo){
            Arrays.fill(states,State.UNVISITED);
        }

        return pathExists(arr,0,0,memo);
    }

    public static boolean pathExists(int[][] arr,int i,int j,State[][] memo) {
        if(oob(arr,i,j) || arr[i][j] == 1){
            return false;
        }

        if(i == arr.length-1 && j == arr[0].length-1){
            possiblePaths++;
            return true;
        }

        if(memo[i][j] == State.NO_PATH || memo[i][j] == State.VISITING){
            return false;
        }
        memo[i][j] = State.VISITING;

        Pair[] points = {
                new Pair(i+1,j),
                new Pair(i-1,j),
                new Pair(i,j+1),
                new Pair(i,j-1)
        };

        for(Pair point: points){
            if(pathExists(arr,(Integer)point.fst,(Integer)point.snd,memo)){
                return true;
            }
        }

        memo[i][j] = State.NO_PATH;

        return false;
    }

    public static boolean oob(int[][] arr,int i,int j){
        return i < 0 || i >= arr.length || j < 0 || j > arr[0].length;
    }

    public static void main(String args[]){
        System.out.println(MazeProblem.pathExists(new int[][]{{0,1,0,0,0},{0,0,0,1,0},{0,1,0,1,0},{0,0,0,1,0}}));
        System.out.println(possiblePaths);

    }
}
