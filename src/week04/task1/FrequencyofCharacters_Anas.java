package week04.task1;

public class FrequencyofCharacters_Anas {
    public static void main(String[] args) {
        System.out.println(frequency("aaabbbccddddt"));
    }
    public static String frequency(String word){

        String result ="";

        for (int i = 0; i < word.length(); i++) {
            int c=0;
            if (result.contains(""+word.charAt(i))){
                continue;
            }
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        c++;
                    }
                }
                if (!result.contains("" + word.charAt(i))) {
                    result += "" + word.charAt(i) + c;

                }

        }
        return result;

    }
}
