package week04.task1;

public class StringFrequencyOfCharacters_Fatih {

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD")); // A3B2C1D2
    }


    public static String frequencyOfChars(String word) {
        String result = ""; // Initialize an empty string to store the result

        for (int i = 0; i < word.length(); i++) {// Iterate through each character in the word
            char currentChar = word.charAt(i); // Get the current character at index i
            int count = 1; // Initialize the count for the current character to 1

            for (int j = i + 1; j < word.length(); j++) {// Check the successive characters for equality
                if (word.charAt(j) == currentChar) { // If the character at index j is equal to the current character
                    count++;// Increment the count
                    i++; // Skip the repeated characters in the next iteration of the outer loop
                } else {
                    break;// If the characters are not equal, exit the inner loop
                }
            }

            result += currentChar + String.valueOf(count);//Concatenate the current character and its count to the result string
        }

        return result;// Return the final result
    }
}

/*
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
