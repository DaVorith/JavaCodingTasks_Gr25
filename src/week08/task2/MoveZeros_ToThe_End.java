package week08.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MoveZeros_ToThe_End {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr(new int[]{1, 2, 0, 4, 0, 5, 6, 0, 3, 9})));
    }
    public static int[] arr (int[] array){
//        List<Integer> arr = new LinkedList<>();
//
//        for (int i = 0; i < array.length; i++) {
//            arr.add(array[i]);
//        }
//        for (int i = 0; i < arr.size(); i++) {
//            if (arr.get(i)==0){
//                //int zero=arr.get(i);
//                arr.remove(arr.get(i));
//                arr.add(0);
//            }
//        }
        int [] arr=new int[array.length];
        int y=arr.length-1;
        int z=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=0){
                arr[z++]=array[i];
            }
            else
                arr[y--]=array[i];
        }

        return arr;
    }
}
