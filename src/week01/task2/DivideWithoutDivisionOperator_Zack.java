package week01.task2;

public class DivideWithoutDivisionOperator_Zack {

     /*
     Numbers - Divide without / operator:
     Write a method that can divide two numbers without using division operator
     */
     public static void main(String[] args) {
         System.out.println(num(1,0));
     }
    public static int num(int num1, int num2){

        int count=0;
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }else {

            if (num1 < num2) {
                return 0;
            }

            while (num1 >= num2) {
                num1 -= num2;
                count++;
            }
        }
        return count;
    }





}


