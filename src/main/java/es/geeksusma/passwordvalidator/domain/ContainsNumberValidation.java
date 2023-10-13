package es.geeksusma.passwordvalidator.domain;

public class ContainsNumberValidation {
    public boolean containsNumber(String password) {
        char[] chars = password.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
