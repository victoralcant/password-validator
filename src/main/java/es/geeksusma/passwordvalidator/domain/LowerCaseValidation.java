package es.geeksusma.passwordvalidator.domain;

public class LowerCaseValidation {
    public boolean containsLowerCase(String password) {
        char[] chars = password.toCharArray();
        for (char c : chars) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }
}
