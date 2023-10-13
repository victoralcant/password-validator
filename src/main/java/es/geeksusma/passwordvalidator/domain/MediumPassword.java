package es.geeksusma.passwordvalidator.domain;

public class MediumPassword implements Password {
    private final String password;

    private final CapitalLetterValidation capitalLetterValidation = new CapitalLetterValidation();
    private final LowerCaseValidation lowerCaseValidation = new LowerCaseValidation();
    private final ContainsNumberValidation containsNumberValidation = new ContainsNumberValidation();
    private final UnderscoreValidation underscoreValidation = new UnderscoreValidation();

    private MediumPassword(String password) {
        this.password = password;
    }

    public static MediumPassword of(String password) {
        return new MediumPassword(password);
    }

    @Override
    public boolean check() {
        return password != null && password.length() > 16
                && capitalLetterValidation.containsCapitalLetter(this.password)
                && lowerCaseValidation.containsLowerCase(this.password)
                && containsNumberValidation.containsNumber(this.password)
                && underscoreValidation.containsUnderscore(this.password);
    }
}
