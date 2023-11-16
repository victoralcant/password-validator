package es.geeksusma.passwordvalidator.domain.validations;

import java.util.function.Predicate;

public class ContainsUnderscore implements Predicate<String> {
    private static final char UNDERSCORE_SYMBOL = '_';

    @Override
    public boolean test(String password) {
        return password.chars().anyMatch(c -> c == UNDERSCORE_SYMBOL);
    }
}
