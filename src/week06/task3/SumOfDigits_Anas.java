package week06.task3;

public class SumOfDigits_Anas {
    public static void main(String[] args) {
        System.out.println(sumOfDig("12reter7"));
    }

    public static int sumOfDig(String str){

        int sum=0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                sum+= Integer.parseInt(""+str.charAt(i));
            }
        }
        return sum;
    }
}
