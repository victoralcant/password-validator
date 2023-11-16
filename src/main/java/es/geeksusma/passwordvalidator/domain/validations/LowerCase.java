package es.geeksusma.passwordvalidator.domain.validations;

import java.util.Optional;
import java.util.function.Predicate;

public class LowerCase implements Predicate<String>{

    @Override
    public boolean test(String password) {
        return password.chars().anyMatch(Character::isLowerCase);
    }
}
