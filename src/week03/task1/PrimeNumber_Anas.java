package week03.task1;

public class PrimeNumber_Anas {
    public static void main(String[] args) {
        System.out.println(prime(1));
    }
    public static boolean prime(int num){
        int count =0;
        if(num==1){
            return true;
        }
        for (int i = 1; i <= num; i++) {
            if (num%i==0){
                count++;
            }
        }
        return count==2;
    }
}
