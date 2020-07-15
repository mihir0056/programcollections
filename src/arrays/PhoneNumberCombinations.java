package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneNumberCombinations {

    static HashMap<Character,Character[]> map = new HashMap<>();

    public static List<String> letterCombinations(String digits) {


        return PhoneNumberCombinations.getCombinations(map.get(digits.charAt(0)),map.get(digits.charAt(1)));

    }

    public static List<String> getCombinations(Character[] arr1, Character[] arr2){

        List<String> list = new ArrayList<>();

        for(int i=0;i<arr1.length;i++) {
            for (int j = 0; j < arr2.length; j++) {
                list.add(Character.toString(arr1[i]) + Character.toString(arr2[j]));
            }
            }

        return list;
    }


    public static void main(String args[]){



        map.put('2',new Character[]{'a','b','c'});
        map.put('3',new Character[]{'d','e','f'});

        System.out.println(PhoneNumberCombinations.letterCombinations("23"));
    }


}
