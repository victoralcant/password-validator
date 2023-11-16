package es.geeksusma.passwordvalidator.domain.validations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LowerCaseTest {

    @Test
    void shouldBeValid_whenAPasswordContainsALowerCaseLetter() {
        LowerCase validation = new LowerCase();
        boolean isValid = validation.test("ANYPaSsWord");
        assertThat(isValid).isTrue();
    }

    @Test
    void shouldBeNotValid_whenAPasswordContainsALowerCaseLetter() {
        LowerCase validation = new LowerCase();
        boolean isValid = validation.test("ANYPaSsWord");
        assertThat(isValid).isTrue();
    }

    @Test
    void shouldReturnErrorMessage_whenPasswordValidationFail() {
        var validation = new LowerCase();
        var errorMessage = validation.validate("ANYPASS");
        assertThat(errorMessage).contains("Password should contains a lower case letter");
    }
}
