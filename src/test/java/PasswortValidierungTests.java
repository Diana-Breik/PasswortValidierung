import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswortValidierungTests {

    @Test
    void whenPasswordLengthValid_thenReturnVALID(){
        //GIVEN
        String password = "12345678";

        //WHEN
        String actual = PasswortValiedierung.passwortvalidierungAlsLänge(password);

        //THEN
        String expected = "VALID";
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void whenPasswordLengthUnvalid_thenReturnUNVALID(){
        //GIVEN
        String password = "1234";

        //WHEN
        String actual = PasswortValiedierung.passwortvalidierungAlsLänge(password);

        //THEN
        String expected = "UNVALID";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void whenPasswordContainsNumbers_thenReturnTrue(){
        //GIVEN
        String password = "adcd11";

        //WHEN
        String actual = PasswortValiedierung.passwortvalidierung_ZahlenEnthalten(password);

        //THEN
        String expected = "TRUE";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void whenPasswordDoesNOTContainsNumbers_thenReturnFalse(){
        //GIVEN
        String password = "adcdef";

        //WHEN
        String actual = PasswortValiedierung.passwortvalidierung_ZahlenEnthalten(password);

        //THEN
        String expected = "FALSE";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void whenPasswordContainsLetters_thenReturnTrue(){
        //GIVEN
        String password = "adCD11";

        //WHEN
        String actual = PasswortValiedierung.passwortvalidierung_BuchstabenEnthalten(password);

        //THEN
        String expected = "TRUE";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void whenPasswordDoesNOTContainsLetters_thenReturnFalse(){
        //GIVEN
        String password = "1111";

        //WHEN
        String actual = PasswortValiedierung.passwortvalidierung_BuchstabenEnthalten(password);

        //THEN
        String expected = "FALSE";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void whenPasswordContainsCapitalLetters_thenReturnTrue(){
        //GIVEN
        String password = "CD11";

        //WHEN
        String actual = PasswortValiedierung.passwortvalidierung_großeBuchstabenEnthalten(password);

        //THEN
        String expected = "TRUE";
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void whenPasswordContainsLowercaseLetters_thenReturnTrue(){
        //GIVEN
        String password = "ss11";

        //WHEN
        String actual = PasswortValiedierung.passwortvalidierung_kleineBuchstabenEnthalten(password);

        //THEN
        String expected = "TRUE";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void whenPasswordNotGood_thenReturnFalse(){
        //GIVEN
        String password = "passwort";

        //WHEN
        boolean actual = PasswortValiedierung.passwortvalidierung_IsGood(password);

        //THEN
        boolean expected = false;
        Assertions.assertEquals(expected,actual);

    }
}
