package es.geeksusma.passwordvalidator.domain;

import java.util.List;
import java.util.function.Predicate;

public class MediumPassword implements Password {
    private final String password;

    // default validations
    private List<Predicate<String>> validations =
            List.of(new LengthGreaterThan(16),
                    new CapitalLetter(),
                    new LowerCase(),
                    new Number(),
                    new Underscore());

    private MediumPassword(String password) {
        this.password = password;
    }

    private MediumPassword(String password, List<Predicate<String>> validations) {
        this.password = password;
        this.validations = validations;
    }

    public static MediumPassword of(String password) {
        return new MediumPassword(password);
    }

    //Flexible password creation with validations
    public static MediumPassword of(String password, List<Predicate<String>> validations) {
        return new MediumPassword(password, validations);
    }

    @Override
    public boolean check() {
        if (password == null) return false;
        return validations.stream().allMatch(v -> v.test(this.password));
    }
}
