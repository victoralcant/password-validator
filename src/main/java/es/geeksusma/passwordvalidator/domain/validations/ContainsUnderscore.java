package es.geeksusma.passwordvalidator.domain.validations;

import java.util.Optional;
import java.util.function.Predicate;

public class ContainsUnderscore implements Predicate<String>, ErrorMessageValidaton {
    private static final char UNDERSCORE_SYMBOL = '_';

    @Override
    public boolean test(String password) {
        return password.chars().anyMatch(c -> c == UNDERSCORE_SYMBOL);
    }

    @Override
    public Optional<String> validate(String password) {
        if (!test(password)) {
            return Optional.of("Password should contains an underscore " + UNDERSCORE_SYMBOL);
        }
        return Optional.empty();
    }
}
