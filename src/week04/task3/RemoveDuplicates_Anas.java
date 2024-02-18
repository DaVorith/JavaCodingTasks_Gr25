package week04.task3;

public class RemoveDuplicates_Anas {
    public static void main(String[] args) {
        System.out.println(removeDup("aaabbbccddddt"));
    }
    public static String removeDup(String word) {
        String result="";
        for (int i = 0; i <word.length() ; i++) {
            if (!result.contains(""+word.charAt(i))){
                result+= ""+word.charAt(i);
            }
        }
        return result;
    }
}
