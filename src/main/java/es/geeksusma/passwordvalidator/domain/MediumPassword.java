package es.geeksusma.passwordvalidator.domain;

import es.geeksusma.passwordvalidator.domain.validations.*;

import java.util.Set;
import java.util.function.Predicate;

public class MediumPassword implements Password {
    private final String password;

    // default validations
    private Set<Predicate<String>> validations =
            Set.of(new LengthGreaterThan(16),
                    new CapitalLetter(),
                    new LowerCase(),
                    new ContainsNumber(),
                    new ContainsUnderscore());

    private MediumPassword(String password) {
        this.password = password;
    }

    private MediumPassword(String password, Set<Predicate<String>> validations) {
        this.password = password;
        this.validations = validations;
    }

    public static MediumPassword of(String password) {
        return new MediumPassword(password);
    }

    //Flexible password creation with validations
    public static MediumPassword of(String password, Set<Predicate<String>> validations) {
        return new MediumPassword(password, validations);
    }

    @Override
    public boolean check() {
        if (password == null) return false;
        return validations.stream().allMatch(v -> v.test(this.password));
    }
}
