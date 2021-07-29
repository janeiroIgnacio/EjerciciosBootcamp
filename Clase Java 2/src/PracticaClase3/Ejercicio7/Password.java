package PracticaClase3.Ejercicio7;

import java.util.regex.Pattern;

public class Password {

    private Pattern pattern;
    private String value;

    public Password(Pattern pattern) {
        this.pattern = pattern;
    }

    private boolean validate(String value){
        return this.pattern.matcher(value).find();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if(validate(value)) {
            this.value = value;
        }
    }
}
