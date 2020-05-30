package arrays;

import java.util.*;

public class RelativeSortArrays {

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        int result[] = new int[arr1.length];

        int resultCnt = 0;

        for (int j = 0; j <= arr2.length-1; j++) {

            for (int i = 0; i <= arr1.length-1; i++) {
                if (arr2[j] == arr1[i]) {
                    result[resultCnt] = arr2[j];
                    resultCnt++;
                }
            }
        }

        boolean isPresent = false;
        List<Integer> list = new ArrayList<Integer>();

        for (int k = 0; k < arr1.length; k++) {
                for(int l=0;l < arr2.length;l++){
                    if(arr1[k] == arr2[l]){
                        isPresent = true;
                        break;
                    }else{
                        isPresent = false;
                    }
                }
                if(!isPresent){
                    list.add(arr1[k]);
                }
        }

        Collections.sort(list);

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            result[resultCnt] = it.next();
            resultCnt++;
        }

        return result;
    }


    public static int[] relativeSortArray2(int[] arr1, int[] arr2) {

        int result[] = new int[arr1.length];

        int resultCnt = 0;

        for (int j = 0; j <= arr2.length-1; j++) {

            for (int i = 0; i <= arr1.length-1; i++) {
                if (arr2[j] == arr1[i]) {
                    result[resultCnt] = arr2[j];
                    resultCnt++;
                }
            }
        }

        boolean isPresent = false;
        List<Integer> list = new ArrayList<Integer>();

        for (int k = 0; k < arr1.length; k++) {
            for(int l=0;l < arr2.length;l++){
                if(arr1[k] == arr2[l]){
                    isPresent = true;
                    break;
                }else{
                    isPresent = false;
                }
            }
            if(!isPresent){
                list.add(arr1[k]);
            }
        }

        //Arrays.sort(list);

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            result[resultCnt] = it.next();
            resultCnt++;
        }

        return result;
    }

    public static int[] relativeSortArray1(int[] arr1, int[] arr2) {
        Map<Integer,Integer> storeArr1 = new HashMap<Integer,Integer>();
        Set<Integer> sortedSet = new HashSet<Integer>();

        for(int i=0;i<arr1.length;i++){
            int count =1;
            if(storeArr1.get(arr1[i]) != null && storeArr1.get(arr1[i]) > 0){
                count = storeArr1.get(arr1[i]) + 1;
            }

            storeArr1.put(arr1[i],count);
        }

        for(Integer i: storeArr1.keySet()){
            sortedSet.add(i);
        }



        System.out.println(storeArr1);
        return arr1;
    }


    public static void main(String args[]){

       // int result[] = MergeSortedArrays.merge1(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);

        //int result[] = RelativeSortArrays.relativeSortArray(new int[]{2,3,1,3,2,4,6,19,9,2,7,12},new int[]{2,1,4,3,9,6});

        int result[] = RelativeSortArrays.relativeSortArray2(new int[]{2,3,2,3,1,7,4},new int[]{2,1,3});
        for(int i:result){
            System.out.print(i);
        }
    }
}
