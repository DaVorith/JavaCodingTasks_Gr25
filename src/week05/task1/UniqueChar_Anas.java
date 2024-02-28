package week05.task1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueChar_Anas {

    public static void main(String[] args) {
        System.out.println(UniqueChar("aaabbbnddfjjl"));
    }
    public static String UniqueChar(String word){

       String result = "";

        for (int i = 0; i < word.length(); i++) {
            int c=0;
            for (int j = 0; j < word.length() ; j++) {
                if (word.charAt(i)==word.charAt(j)){
                    c++;
                }
            }
            if (c==1){
                result+=""+word.charAt(i);
            }
        }


        return result;
    }

}
