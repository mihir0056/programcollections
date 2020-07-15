package dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {

    /*
    Input: [[10,20],[30,200],[400,50],[30,20]]
    Output: 110
    Explanation:
    The first person goes to city A for a cost of 10.
    The second person goes to city A for a cost of 30.
    The third person goes to city B for a cost of 50.
    The fourth person goes to city B for a cost of 20.

    The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.
     */

    public static int twoCityScheduleCost(int[][] costs) {

        for(int i=0;i<costs.length;i++){
            System.out.print(costs[i][0]);System.out.print(costs[i][1]);
            System.out.println();
        }

        Arrays.sort(costs, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                System.out.print(a[1]);System.out.print(a[0]);System.out.print(b[1]);System.out.print(b[0]);
                return (a[1] - a[0]) - (b[1] - b[0]);
            }
        });

        System.out.println("=================");
        for(int i=0;i<costs.length;i++){
            System.out.print(costs[i][0]);System.out.print(costs[i][1]);
            System.out.println();
        }

        int totalMinCost = 0;
        for (int i = 0; i < costs.length / 2; i++) {
            totalMinCost += costs[i][1] + costs[costs.length-i-1][0];
        }
        return totalMinCost;
    }

    public static void main(String args[]){
        System.out.println("Min Cost : " + TwoCityScheduling.twoCityScheduleCost(new int[][]{{10,20},{30,200},{400,50},{30,20}}));
    }


}
