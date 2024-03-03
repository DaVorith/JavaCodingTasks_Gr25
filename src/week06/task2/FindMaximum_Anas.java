package week06.task2;

public class FindMaximum_Anas {
    public static void main(String[] args) {
        System.out.println(findMax(new int[]{1, 2, 3, 4, 5}));
    }

    public static int findMax(int [] arr){
        int max=0;
        for (int i=0;i<arr.length;i++) {
             if(arr[i]>max) max= arr[i];
        }
        return max;
    }
}
