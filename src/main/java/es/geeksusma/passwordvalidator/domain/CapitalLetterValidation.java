package es.geeksusma.passwordvalidator.domain;

public class CapitalLetterValidation {
    public boolean containsCapitalLetter(String password1) {
        char[] chars = password1.toCharArray();
        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
}
