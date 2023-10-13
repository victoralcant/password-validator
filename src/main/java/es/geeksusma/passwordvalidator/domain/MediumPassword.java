package es.geeksusma.passwordvalidator.domain;

import java.util.ArrayList;
import java.util.List;

public class MediumPassword implements Password {
    private final String password;

    private final List<PasswordValidator> validations = new ArrayList<>();

    private MediumPassword(String password) {
        validations.add(new CapitalLetterValidation());
        validations.add(new LowerCaseValidation());
        validations.add(new NumberValidation());
        validations.add(new UnderscoreValidation());
        validations.add(new LengthGreaterThan16());
        this.password = password;
    }

    public static MediumPassword of(String password) {
        return new MediumPassword(password);
    }

    @Override
    public boolean check() {
        if (password == null) return false;
        return validations.stream()
                .allMatch(v -> v.validate(this.password));
    }
}
