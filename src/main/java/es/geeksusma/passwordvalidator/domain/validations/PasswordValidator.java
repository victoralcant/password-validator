package es.geeksusma.passwordvalidator.domain.validations;

public interface PasswordValidator {
    boolean validate(String password);
}
