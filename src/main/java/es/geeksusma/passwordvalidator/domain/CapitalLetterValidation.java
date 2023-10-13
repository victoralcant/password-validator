package es.geeksusma.passwordvalidator.domain;

public class CapitalLetterValidation {
    public boolean containsCapitalLetter(String password) {
        return password.chars().anyMatch(Character::isUpperCase);
    }
}
