package week02.task2;

public class Divisible_Anas {
    public static void main(String[] args) {
        System.out.println(Divisible(0,100));
    }
    public static String Divisible(int a, int b){

        String by15 = "Divisible By 15 - ";
        String by5 = "Divisible By 5 -";
        String by3 = "Divisible By 3";

        for (int i = a; i >= b; i++) {
            if (i % 15 == 0) {
                by15 += i + " ";
            } else if (i % 5 == 0) {
                by5 += i + " ";
            } else if (i % 3 == 0) {
                by3 += i + " ";
            }
        }
        String ALl = by15 +"\n"+by5+"\n"+by3;

        return ALl;


    }
}
