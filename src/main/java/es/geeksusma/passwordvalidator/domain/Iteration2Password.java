package es.geeksusma.passwordvalidator.domain;

import static java.lang.Character.*;

public class Iteration2Password implements Password{
    private final String password;
    private Iteration2Password(String password) {
        this.password = password;
    }

    public static Iteration2Password of(String password) {
        return new Iteration2Password(password);
    }

    @Override
    public boolean check() {
        return password != null && password.length() > 16
                && containsCapitalLetter()
                && containsLowerCase()
                && containsNumber()
                && containsUnderscore();
    }

    private boolean containsCapitalLetter() {
        char[] chars = this.password.toCharArray();
        for (char c : chars) {
            if(isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    private boolean containsLowerCase() {
        char[] chars = this.password.toCharArray();
        for (char c : chars) {
            if(isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    private boolean containsNumber() {
        char[] chars = this.password.toCharArray();
        for (char c : chars) {
            if(isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private boolean containsUnderscore() {
        char[] chars = this.password.toCharArray();
        for (char c : chars) {
            if(c == '_') {
                return true;
            }
        }
        return false;
    }
}
