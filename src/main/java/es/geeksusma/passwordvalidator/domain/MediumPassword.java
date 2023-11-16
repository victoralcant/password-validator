package es.geeksusma.passwordvalidator.domain;

import es.geeksusma.passwordvalidator.domain.validations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class MediumPassword implements PasswordErrorChecker {
    private final String password;

    // default validations
    private Set<ErrorMessageValidaton> validations =
            Set.of(new LengthGreaterThan(16),
                    new CapitalLetter(),
                    new LowerCase(),
                    new ContainsNumber(),
                    new ContainsUnderscore());

    private MediumPassword(String password) {
        if (password == null) {
            throw new RuntimeException("null password");
        }
        this.password = password;
    }

    private MediumPassword(String password, Set<ErrorMessageValidaton> validations) {
        if (password == null) {
            throw new RuntimeException("null password");
        }
        this.password = password;
        this.validations = validations;
    }

    public static MediumPassword of(String password) {
        return new MediumPassword(password);
    }

    //Flexible password creation with validations
    public static MediumPassword of(String password, Set<ErrorMessageValidaton> validations) {
        return new MediumPassword(password, validations);
    }

    @Override
    public List<String> check() {
        List<String> errors = new ArrayList<>();
        validations.forEach(v -> {
            Optional<String> optErr = v.validate(this.password);
            optErr.ifPresent(errors::add);
        });
        return errors;
    }
}
