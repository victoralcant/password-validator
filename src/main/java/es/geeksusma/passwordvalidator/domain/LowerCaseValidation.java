package es.geeksusma.passwordvalidator.domain;

public class LowerCaseValidation {
    public boolean containsLowerCase(String password) {
        return password.chars().anyMatch(Character::isLowerCase);
    }
}
