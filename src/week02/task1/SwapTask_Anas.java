package week02.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapTask_Anas {
    /*
    private final int first;
    private final int second;

    public SwapTask_Anas(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "SwapTask_Anas{" +
                "a=" + first +
                ", b=" + second +
                '}';
    }

    public static SwapTask_Anas swap(int a, int b){
        return new SwapTask_Anas(b,a);
    }

     */
    public static void main(String[] args) {

        int a =10;
        int b = 15;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a= "+a+" "+"b= "+b);

    }

}
