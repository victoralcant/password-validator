package es.geeksusma.passwordvalidator.domain.validations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsNumberTest {

    @Test
    void shouldReturnTrue_whenAPasswordContainsANumber() {
        ContainsNumber validation = new ContainsNumber();
        boolean isValid = validation.test("AnyPassw0rd");
        assertThat(isValid).isTrue();
    }
}
