package arrays;

public class ReverseString2 {

    /*
    Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
    Example:
    Input: s = "abcdefg", k = 2
    Output: "bacdfeg"
    Restrictions:
    The string consists of lower English letters only.
    Length of the given string and k will in the range [1, 10000]
     */
    public static String reverseStr(String s, int k) {

        int sl = s.length();

        StringBuffer str = new StringBuffer();

          for(int i=k-1;i>=0;i--){
                str.append(s.charAt(i));
            }

          if(k > s.length()-1){
              return str.toString();
          }

        return str.append(s.substring(k)).toString();
    }

    public static void main(String args[]){
        System.out.print(ReverseString2.reverseStr("abcdefg",2));
    }

}
