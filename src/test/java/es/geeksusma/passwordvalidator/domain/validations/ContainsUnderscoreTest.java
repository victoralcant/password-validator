package es.geeksusma.passwordvalidator.domain.validations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsUnderscoreTest {

    @Test
    void shouldReturnTrue_whenAPasswordContainsUnderscoreSymbol() {
        var validation = new ContainsUnderscore();
        boolean isValid = validation.test("Any_Password");
        assertThat(isValid).isTrue();
    }

    @Test
    void shouldReturnFalse_whenAPasswordNotContainsUnderscoreSymbol() {
        var validation = new ContainsUnderscore();
        boolean isValid = validation.test("AnyPassword");
        assertThat(isValid).isFalse();
    }
}
