package week06.task1;

public class PasswordValidation_Anas {

    public static void main(String[] args) {
        System.out.println( Pwd("2@Wodeen"));
    }
    public static boolean Pwd(String password){

        boolean isdig=false, isUpper=false, isLower=false, isSpecial=false;

        if (password.length()>=6 && !password.contains(" ")){

            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))){
                    isdig=true;
                }
                else if (Character.isUpperCase(password.charAt(i))){
                    isUpper=true;
                }
                else if (Character.isLowerCase(password.charAt(i))){
                    isLower=true;
                }
                else if (!Character.isLetterOrDigit(password.charAt(i)) ){
                    isSpecial=true;
                }
            }

        }
        return (isdig && isLower && isSpecial && isUpper);
    }
}
