package week08.task1;

import java.util.Arrays;

public class N_unique_integers_that_sum_up_to_0 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr(4)));
    }
    public static int[] arr(int N){
        int [] arr =new int [N];

        if(N>0 && N<100){
            int sum=0;
            for (int i = 0; i < N-1; i++) {
                arr[i]=i+1;
                sum+=arr[i];
            }
            arr[arr.length-1]=-sum;

        }else {
            throw new IllegalArgumentException();
        }
        return arr;
    }
}
