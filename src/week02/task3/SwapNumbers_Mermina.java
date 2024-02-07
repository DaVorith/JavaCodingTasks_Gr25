package week02.task3;

public class SwapNumbers_Mermina {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a * b; // a = 200 (10 * 20)
        b = a / b; // b = 10 (200 / 20)
        a = a / b; // a = 20 (200 / 10)

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}











    //Swap two variable values without using a third variable


