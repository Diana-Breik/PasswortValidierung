public class PasswortValiedierung {

    public static String passwortvalidierungAlsLänge(String password) {

        if(password.length()>7){
            return "VALID";
        }
        else {
            return "UNVALID";
        }
    }

    public static String passwortvalidierung_ZahlenEnthalten(String password) {
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

    public static String passwortvalidierung_BuchstabenEnthalten(String password) {
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

    public static String passwortvalidierung_großeBuchstabenEnthalten(String password) {
        int uppercase_counter=0;
        char [] pass= new char[password.length()];
        for(int i =0;i< password.length();i++)
        {
            pass[i]= password.charAt(i);
        }
        for(char wert : pass){
            if(Character.isUpperCase(wert))
            {
                uppercase_counter++;
                break;
            }
        }
        if(uppercase_counter!=0){
            return "TRUE";
        }
        else {
            return "FALSE";
        }
    }

    public static String passwortvalidierung_kleineBuchstabenEnthalten(String password) {
          if(password.matches(".*[a-z].*"))
          {
              return "TRUE";
          }
        return "FALSE";
    }
}
