package week01.task2;

public class DivideWithoutDivisionOperator_Mermina {

    public static void main(String[] args) {



        divideWithoutOperator(16, 7);
    }

    public static void divideWithoutOperator(int num1, int num2) {
        int count = 0;
        while (num1 >= num2) {// 10 >= 6 true
            num1 -= num2; // 10
            count++;
        }
        System.out.println(count + " remainder is " + num1);
    }
}







//  Write a method that can divide two numbers without using division operator.
