package week02.task3;

public class consecutiveNumbers_Anas {
    public static void main(String[] args) {
        consecutiveNumbers(20);
    }
    public static void consecutiveNumbers(int num){
        for (int i = 1; i < num; i++) {
            String result ="";
            if (i % 2 == 0){
                result+= "Codility";
            }
            if (i % 3 == 0){
                result+= "Test";
            }
            if (i % 5 == 0){
                result+= "Coders";
            }

            System.out.println((result.isEmpty())? i : result);
        }
    }
}
