package es.geeksusma.passwordvalidator.domain;

public class UnderscoreValidation implements PasswordValidator {
    private static final char UNDERSCORE = '_';

    @Override
    public boolean validate(String password) {
        return password.chars().anyMatch(c -> c == UNDERSCORE);
    }
}
