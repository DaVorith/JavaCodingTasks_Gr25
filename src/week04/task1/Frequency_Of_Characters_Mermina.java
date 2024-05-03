package week04.task1;

public class Frequency_Of_Characters_Mermina {

    public static void main(String[] args) {
        String str = "Unated States";
        int[] freq = new int[str.length()];
        char[] string = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (string[i] == string[j]) {
                    freq[i]++;
                    // Set string[j] to '0' to avoid printing visited character
                    string[j] = '0';
                }
            }
        }

        System.out.println("Characters and their corresponding frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (string[i] != ' ' && string[i] != '0') {
                System.out.println(string[i] + "-" + freq[i]);
            }
        }
    }
}








   //Write a return method that can find the frequency of characters
    //  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2


// Explanation:The String str is initialized with the value "United States".
   //The outer for loop iterates through each character in the string.
   //The inner for loop starts from i + 1 and compares the character at index i with subsequent characters.
   //After both loops complete, we print the characters and their corresponding frequencies.