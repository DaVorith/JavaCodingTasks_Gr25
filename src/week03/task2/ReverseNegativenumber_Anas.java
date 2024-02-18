package week03.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseNegativenumber_Anas {
    public static void main(String[] args) {
        System.out.println(NegativNum(-125));
    }
    public static int NegativNum(int num){

        String number ="";

        for (int i = String.valueOf(num).length()-1; i >0 ; i--) {
            number+= String.valueOf(num).charAt(i);
        }
        return -Integer.parseInt(number);
    }


}
