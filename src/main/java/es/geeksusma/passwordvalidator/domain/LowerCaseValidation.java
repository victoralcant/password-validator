package es.geeksusma.passwordvalidator.domain;

public class LowerCaseValidation implements PasswordValidator{

    @Override
    public boolean validate(String password) {
        return password.chars().anyMatch(Character::isLowerCase);
    }
}
