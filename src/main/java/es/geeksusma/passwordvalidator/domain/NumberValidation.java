package es.geeksusma.passwordvalidator.domain;

public class NumberValidation {
    public boolean containsNumber(String password) {
        return password.chars().anyMatch(Character::isDigit);
    }
}
