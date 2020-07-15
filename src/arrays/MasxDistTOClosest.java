package arrays;

public class MasxDistTOClosest {
    public static int maxDistToClosest(int[] seats) {
        int max = 0;
        int currentMax = 0;

        for(int i=0;i<seats.length;i++){
            if(seats[i] == 0){
                currentMax = currentMax++;
            }
        }

        return 0;
    }
}
