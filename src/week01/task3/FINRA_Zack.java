package week01.task3;

import java.util.Arrays;

public class FINRA_Zack {

    public static void main(String[] args) {
        FINRA(40);
    }

    public static void FINRA(int num){
        if(num%15==0){
            System.out.println("FINRA");
        } else if (num%3==0) {
            System.out.println("FIN");
        } else if (num%5==0) {
            System.out.println("RA");
        }else{
            System.out.println(num);
        }
    }

    /*
     Write a function which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
     print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.
     For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */

}
