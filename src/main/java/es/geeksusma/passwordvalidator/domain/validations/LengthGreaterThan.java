package es.geeksusma.passwordvalidator.domain.validations;

import java.util.function.Predicate;

public class LengthGreaterThan implements Predicate<String> {

    private final int minLength;

    public LengthGreaterThan(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public boolean test(String password) {
        return password.length() > minLength;
    }
}
