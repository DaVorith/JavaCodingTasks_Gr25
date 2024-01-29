package week01.task1;

import java.util.Scanner;

public class OddOrEven_Zack {

    /*
     Numbers - Odd or even:
     Write  a method which can identify given number is even or odd
     Output ex:
     identify(5); ->"Odd"
     identify(6); ->"Even"
     */
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        int NumBers = in.nextInt();
        System.out.println(oddOReven(NumBers));






    }
    public static String oddOReven(int num){

    if (num%2 == 0)
        return "even";
    else
        return "odd";

    }



}
