package wqeek02;

public class SwapNumber {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap numbers without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
/*
a is updated to hold the sum of a and b.
b is updated to hold the difference between the new value of a and the original value of
 b, effectively storing the original value of a.
a is updated to hold the difference between the new value of
a (which now holds the sum of the original values of a and b) and the new value of
 b, effectively storing the original value of b.
 */
/*

 Numbers -- Swap Numbers
Swap two variable values without using a third variable

 */
