package es.geeksusma.passwordvalidator.domain;

public class LengthGreaterThan16 implements PasswordValidator{
    @Override
    public boolean validate(String password) {
        return password.length() > 16;
    }
}
