package week02.task1;

public class SwapNumbers_Fatih {

    public static void main(String[] args) {


        int a = 10;// Initialized two variables
        int b = 15;

        System.out.println("a = " + a);//before;
        System.out.println("b = " + b);//before

        // Here we swap values without using a 3rd variable
        a = a + b;//both values added in 'a'
        b = a - b;
        a = a - b; // a = 15, b = 10;

        System.out.println("a = " + a);//after
        System.out.println("b = " + b);//after

    }
}
 /*
        Swap two variable values without using a third variable
        */
