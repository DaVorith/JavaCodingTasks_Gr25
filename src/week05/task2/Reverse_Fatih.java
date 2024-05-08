package week05.task2;

public class Reverse_Fatih {

    public static void main(String[] args) {
        String reversed = reverse("BIDEN");
        System.out.println(reversed);
    }

    public static String reverse(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }


}
/*
Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA 
 */