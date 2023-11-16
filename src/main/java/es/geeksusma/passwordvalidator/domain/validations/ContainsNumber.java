package es.geeksusma.passwordvalidator.domain.validations;

import java.util.function.Predicate;

public class ContainsNumber implements Predicate<String> {

    @Override
    public boolean test(String password) {
        return password.chars().anyMatch(Character::isDigit);
    }
}
