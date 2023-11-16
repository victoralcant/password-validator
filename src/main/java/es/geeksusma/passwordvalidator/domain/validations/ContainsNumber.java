package es.geeksusma.passwordvalidator.domain.validations;

import java.util.Optional;
import java.util.function.Predicate;

public class ContainsNumber implements Predicate<String>, ErrorMessageValidaton{

    @Override
    public boolean test(String password) {
        return password.chars().anyMatch(Character::isDigit);
    }

    @Override
    public Optional<String> validate(String password) {
        if (!test(password)) {
            return Optional.of("Password should contains a number");
        }
        return Optional.empty();
    }
}
