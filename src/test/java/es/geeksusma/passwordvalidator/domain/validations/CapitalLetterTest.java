package es.geeksusma.passwordvalidator.domain.validations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CapitalLetterTest {

    @Test
    void shouldReturnTrue_WhenAPasswordContainsAnUpperCaseLetter() {
        var validation = new CapitalLetter();

        assertThat(validation.test("Password")).isTrue();
    }

    @Test
    void shouldReturnFalse_WhenAPasswordContainsAnUpperCaseLetter() {
        var validation = new CapitalLetter();

        assertThat(validation.test("Password")).isTrue();
    }
}
