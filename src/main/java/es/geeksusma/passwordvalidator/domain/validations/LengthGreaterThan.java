package es.geeksusma.passwordvalidator.domain.validations;

import java.util.Optional;
import java.util.function.Predicate;

public class LengthGreaterThan implements Predicate<String>, ErrorMessageValidaton {

    private final int minLength;

    public LengthGreaterThan(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public boolean test(String password) {
        return password.length() > minLength;
    }

    @Override
    public Optional<String> validate(String password) {
        if (!test(password)) {
            return Optional.of("Password length must be greater than " + minLength);
        }
        return Optional.empty();
    }
}
