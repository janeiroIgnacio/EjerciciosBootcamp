package PracticaClase3.Ejercicio7;

import java.util.regex.Pattern;

public class PasswordSimple extends Password{

    private Pattern pattern;
    private String value;

    public PasswordSimple(Pattern pattern) {
        super(pattern);
    }

}
