package es.geeksusma.passwordvalidator.domain.validations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LengthGreaterThanTest {

    @Test
    void shouldReturnTrue_whenAPasswordLengthIsGreaterThanTheMinLength() {
        var validation = new LengthGreaterThan(6);
        boolean isValid = validation.test("AnyPassword");
        assertThat(isValid).isTrue();
    }

    @Test
    void shouldReturnFalse_whenAPasswordLengthIsShorterThanTheMinLength() {
        var validation = new LengthGreaterThan(6);
        boolean isValid = validation.test("pass");
        assertThat(isValid).isFalse();
    }

    @Test
    void shouldReturnErrorMessage_whenValidationFail() {
        var validation = new LengthGreaterThan(6);
        var errorMessage = validation.validate("pass");
        assertThat(errorMessage).contains("Password length must be greater than 6");
    }
}
