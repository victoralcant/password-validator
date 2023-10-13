package es.geeksusma.passwordvalidator.domain;

public class CapitalLetterValidation implements PasswordValidator {

    @Override
    public boolean validate(String password) {
        return password.chars().anyMatch(Character::isUpperCase);
    }
}
