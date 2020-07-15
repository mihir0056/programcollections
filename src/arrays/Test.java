package arrays;

import java.util.HashMap;
import java.util.HashSet;

public class Test {

    public static long solution(String s) {
        // Type your solution here
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        int maxSize = 1;



        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),s.charAt(i));
            for(int j=1;j<s.length();j++){
                if(map.get(s.charAt(j)) == null){
                    map.put(s.charAt(j),s.charAt(j));
                    if(map.size() > maxSize){
                        maxSize = map.size();
                    }
                }else{
                    map.remove(s.charAt(i));
                    i++;
                }
            }
        }

        return maxSize;
    }

    public static void main(String args[]){

       // System.out.println(Test.solution("nndNfdfdf"));

        System.out.println(Test.binaryPatternMatching("00","aaaaaaaaaa"));
    }


    public static int binaryPatternMatching(String pattern, String s) {

        HashSet<Character> set = new HashSet<Character>();
        int count = 0;

        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');

        int i=0;
        int j = pattern.length();
        while (i<= s.length() - pattern.length() && j <= s.length()){
            String sub = s.substring(i,j);
            int temp =0;
            while(temp < pattern.length()){
                if((pattern.charAt(temp) == '0' && set.contains(sub.charAt(temp))) || (pattern.charAt(temp) == '1' &&pattern.charAt(temp) == '1')){
                    temp++;
                    if(temp == pattern.length()){
                        count = count +1 ;
                    }
                    continue;
                }else{

                    break;
                }
            }
            i++;
            j++;
        }



       /* for(int i=0;i<=s.length()-pattern.length();i++){
            for(int j=pattern.length()-1;j<s.length();j++){
                String sub = s.substring(i,j+1);
                int temp =0;
                while(temp < pattern.length()){
                    if(!(pattern.charAt(temp) == '0' && set.contains(sub.charAt(temp)))){
                        break;
                    }else{
                        temp++;
                        if(temp == pattern.length()){
                            count = count +1 ;
                        }
                        continue;
                    }
                }
            }
        }*/

        return count;

    }
}
