package es.geeksusma.passwordvalidator.domain;

public class UnderscoreValidation {
    public boolean containsUnderscore(String password) {
        char[] chars = password.toCharArray();
        for (char c : chars) {
            if (c == '_') {
                return true;
            }
        }
        return false;
    }
}
