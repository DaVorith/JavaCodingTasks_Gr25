package week01.task1;

public class OddOrEven_Liudmila {

    public static String oddOrEven(int number){
        String oddOrEven = (number % 2 == 0) ? "Even" : "Odd";
        return oddOrEven;
    }

    /*
     Numbers - Odd or even:
     Write  a method which can identify given number is even or odd
     Output ex:
     identify(5); ->"Odd"
     identify(6); ->"Even"
     */

    public static void main(String[] args) {

        System.out.println(oddOrEven(5));
        System.out.println(oddOrEven(6));
    }


}
