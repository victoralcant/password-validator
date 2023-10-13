package es.geeksusma.passwordvalidator.domain;

public class NumberValidation implements PasswordValidator{

    @Override
    public boolean validate(String password) {
        return password.chars().anyMatch(Character::isDigit);
    }
}
