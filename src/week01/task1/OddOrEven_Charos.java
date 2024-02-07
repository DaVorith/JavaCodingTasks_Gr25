package week01.task1;

public class OddOrEven_Charos {

        public static void main(String[] args) {
            identifyOddEven(5); // ->  "Odd"
            identifyOddEven(6); // ->  "Even"
        }
    public  static  String  identifyOddEven(int number) {


        return number % 2 == 0 ? "Even" : "odd";
    }
}
