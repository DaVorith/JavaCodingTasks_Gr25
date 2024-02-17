package week01.task2;

public class DivideWithoutDivisionOperator_Liudmila {

    /*
    Numbers - Divide without / operator:
    Write a method that can divide two numbers without using division operator
    */


    public static int divideWithoutOperator(int number1, int number2) {
        int absNumber1 = Math.abs(number1);
        int absNumber2 = Math.abs(number2);
        int quantity = 0;
        boolean isNumber1Neg = (number1 < 0) ? true : false;
        boolean isNumber2Neg = (number2 < 0) ? true : false;
        if (number2 == 0) {
            return Integer.MIN_VALUE;
        } else if (number1 == 0) {
            return 0;
        } else {
            while (absNumber1 >= absNumber2) {
                absNumber1 -= absNumber2;
                quantity++;

            }
        }
        if (isNumber1Neg & isNumber2Neg) {
            quantity = quantity;
        } else if (isNumber1Neg || isNumber2Neg){
            quantity = -quantity;
        }
        return quantity;
    }

    public static void main(String[] args) {

        System.out.println(divideWithoutOperator(-25, 5));
    }

}


