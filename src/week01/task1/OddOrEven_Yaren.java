package week01.task1;

public class OddOrEven_Yaren {

    public static void main(String[] args) {

        oddOrEven(5);

    }

    public static void oddOrEven(int num) {

        if (num % 2 == 0) {
            System.out.println("identify(" + num + "); ->\"Even\"");
        }else{
            System.out.println("identify(" + num + "); ->\"Odd\"");
        }

    }
}
