package arrays;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {


    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean [] breakable = new boolean[s.length()+1];
        breakable[0] = true;

        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(breakable[j] && wordDict.contains(s.substring(j,i))){
                    breakable[i] = true;
                    break;
                }
            }
        }

        return breakable[s.length()];
    }

    public static void main(String args[]){
        String s = "catsandog";
        List<String> arr = new ArrayList<String>();
        arr.add("cats");
        arr.add("dog");
        arr.add("an");

        System.out.println(WordBreak.wordBreak(s,arr));
    }

}
