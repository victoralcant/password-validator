package es.geeksusma.passwordvalidator.domain.validations;

import java.util.Optional;

public interface ErrorMessageValidaton {
    Optional<String> validate(String password);
}
