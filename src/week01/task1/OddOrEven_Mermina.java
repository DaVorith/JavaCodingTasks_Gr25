package week01.task1;

import java.util.Scanner;

public class OddOrEven_Mermina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number" );
        int num = scanner.nextInt();
        if(num % 2 == 0) {
            System.out.println(num + " is even" );
        }else{
            System.out.println(num + " is odd" );
        }



    }
}
   /* Write a method that can identify  a given number is even or odd.
        EX:
        identify(5) --> "Odd"
        identify(6) --> "Even" */