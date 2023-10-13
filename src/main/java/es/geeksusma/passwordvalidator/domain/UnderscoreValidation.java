package es.geeksusma.passwordvalidator.domain;

public class UnderscoreValidation {
    private static final char UNDERSCORE = '_';

    public boolean containsUnderscore(String password) {
        return password.chars().anyMatch(c -> c == UNDERSCORE);
    }
}
