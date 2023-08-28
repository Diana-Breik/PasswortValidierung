public class PasswortValiedierung {

    public static String passwortvalidierungAlsLänge(String password) {

        if(password.length()>7){
            return "VALID";
        }
        else {
            return "UNVALID";
        }
    }

    public static String passwortvalidierungalsZahlenEnthalten(String password) {
        int number_counter=0;
        for(int i=0 ;i< password.length(); i++){
            if(Character.isDigit(password.charAt(i)))
            {
                number_counter++;
            }
        }
        if(number_counter!=0){
            return "TRUE";
        }
        else {
            return "FALSE";
        }
    }

    public static String passwortvalidierungalsBuchstabenEnthalten(String password) {
        int character_counter=0;
        for(int i=0 ;i< password.length(); i++){
            if(Character.isLetter(password.charAt(i)))
            {
                character_counter++;
            }
        }
        if(character_counter!=0){
            return "TRUE";
        }
        else {
            return "FALSE";
        }
    }
}
