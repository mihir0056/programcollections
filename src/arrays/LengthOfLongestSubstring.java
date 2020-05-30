package arrays;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int strLength = s.length(), output = 0;
        Map<Character,Integer> map = new HashMap<>();

        for(int j=0,i=0; j<strLength;j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)),i);
            }
            output = Math.max(output,j-i+1);
            map.put(s.charAt(j),j+1);
        }
        return output;
    }

    public static void main (String args[]){

    }

}
