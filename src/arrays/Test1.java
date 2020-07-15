package arrays;

import java.math.BigInteger;
import java.util.*;

public class Test1 {

    public static long solution(long n) {

        return possibleWays(n+1);
    }

    public static long possibleWays(long n){
        if(n<=1){
            return n;
        }
        return possibleWays(n-1) + possibleWays(n-2);
    }

    public static long[] solution1(long n) {
        // Type your solution here
        List<Long> arr = new ArrayList<Long>();

        if(n < 1){
            return null;
        }
        if(n >= 2){

            arr.add(1L);
            arr.add(1L);
        }
        if(n == 1){

            arr.add(1L);

        }

        for(int i=2;i<n;i++){
            if( i%3 ==0 || i%5 == 0 || i%7 ==0 ){
                arr.add(new Long(i));
            }
        }

        final long[] list = new long[arr.size()];
        int index = 0;
        for (final Long value : arr) {
            list[index++] = value;
        }

        return list;
    }

    public static long[] solution3(long[] numbers) {
        // Type your solution here
        HashMap<Long,Long> map = new HashMap<Long,Long>();

        for(int i=0;i<numbers.length;i++){
            if(!map.containsKey(numbers[i])){
                map.put(numbers[i],1L);
            }else{
                long count = map.get(numbers[i]) + 1L;
                map.put(numbers[i],count);
            }
        }

        List<Long> arr = new ArrayList<Long>();


        long minCount = 1L;
        for(long j : map.keySet()){
            if(map.get(j) != minCount) {
                minCount++;
                continue;
            }else{

                break;
            }
        }

        for(long j : map.keySet()){
            if(map.get(j) == minCount) {
                arr.add(j);
            }
        }

        final long[] list = new long[arr.size()];
        int index = 0;
        for (final Long value : arr) {
            list[index++] = value;
        }

        return list;
    }


    public ListNode reverseList(ListNode head) {
        Stack<ListNode> reverseList = new Stack<ListNode>();

        while(head != null){
            reverseList.push(head);
            head = head.next;
        }

        ListNode newNode = new ListNode();
        while(!reverseList.empty()){
            newNode = reverseList.pop();
        }

        return newNode;
    }

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();

        while(head != null){
            list.add(head.val);
            head = head.next;
        }

        Object[] arr = list.toArray();

        for(int i=0;i<arr.length;i++){
            if(arr[i].toString().equals(arr[arr.length-1-i].toString())){
                continue;
            }else{
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]){

        //System.out.println(Test1.solution(3));

       /*for(Long i :Test1.solution1(9)){
        System.out.println(i);
       }*/

        for(Long i :Test1.solution3(new long[]{10L,941L,13L,13L,13L,941L})){
            System.out.println(i);
        }

    }

    public class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
