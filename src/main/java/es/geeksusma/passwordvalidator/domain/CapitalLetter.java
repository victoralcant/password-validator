package es.geeksusma.passwordvalidator.domain;

import java.util.function.Predicate;

public class CapitalLetter implements Predicate<String> {

    @Override
    public boolean test(String password) {
        return password.chars().anyMatch(Character::isUpperCase);
    }
}
