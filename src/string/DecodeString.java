package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {

        System.out.println("Decode String Program:");
        DecodeString decode = new DecodeString();
        System.out.println(decode.decodeString("3[a2c[cb]]"));

    }

    // Implement the method
    //Input: s = "3[a2c[cb]]"
    ////bccbccaaa

    public String decodeString(String s) {

        Stack<Character> input = new Stack<Character>();
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('c');
        set.add('b');

        //helper method to add the characters

        StringBuffer str = new StringBuffer();

        for(int i=0;i<s.length();i++){
            input.push(s.charAt(i));
        }
        StringBuffer temp1 = new StringBuffer();
        while(!input.isEmpty()){


            if(input.peek() == ']'){   //3[a2c[cb].  //3[a2c[cb
                input.pop();
            }


            if(set.contains(input.peek())){  // temp = bc
                temp1.append(input.pop());         // temp = bcc
            }

            if(input.peek() == '['){    // 3[a2c[    temp = bc
                input.pop();               // 3[a2c    temp = bc
            }

            //   cb

                if(Character.isDigit(input.peek())){      // bcc 2 temp = bccbcc
                    StringBuffer temp2 = new StringBuffer();
                    int i = Character.getNumericValue(input.pop());      // 3 a = aaa
                    while(i > 0) {
                        temp2.append(temp1);
                        i--;
                    }

                    temp1.delete(0, temp1.length());
                    str = str.append(temp2);
                }

        }

        // bccbccaaa
        return str.reverse().toString();
    }
}
