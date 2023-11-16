package es.geeksusma.passwordvalidator.domain;

import java.util.List;

public interface PasswordErrorChecker {
    List<String> check();
}
