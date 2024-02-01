package week01.task1;

public class OddOrEven_Fatih {

    public static void main(String[] args) {

        System.out.println(OddOrEven(5)); // "Odd"
        System.out.println(OddOrEven(6)); // "Even"
    }

    public static String OddOrEven(int number) {
        return number % 2 == 0 ? "Even" : "odd";
    }

}
