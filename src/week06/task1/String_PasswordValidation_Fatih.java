package week06.task1;

public class String_PasswordValidation_Fatih {


    public static void main(String[] args) {
        //Example
        String password1 = "MoneyP@ss123";
        String password2 = "Money";

        // Test the passwords
        System.out.println("Password 1 is valid: " + isValidPassword(password1));
        System.out.println("Password 2 is valid: " + isValidPassword(password2));
    }

    public static boolean isValidPassword(String password) {
        // 1: Password must have at least 6 characters and should not contain space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // 2-5: Check if password contains at least one upper-case letter, one lower-case letter,
        // one special character, and one digit
        boolean hasUpperCase = false, hasLowerCase = false, hasSpecialChar = false, hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if ("!@#$%^&*()-_+=".contains(String.valueOf(ch))) {
                hasSpecialChar = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        // Check if all requirements are met
        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }
}

/*
1. Write a return method that can verify if a password is valid or not.
Requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. Password should at least contain one upper-case letter
3. Password should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
-if all requirements above are met, the method returns true, otherwise returns false
 */