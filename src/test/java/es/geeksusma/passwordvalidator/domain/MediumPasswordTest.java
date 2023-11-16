package es.geeksusma.passwordvalidator.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MediumPasswordTest {
    @Test
    void shouldFailWithExceptionWhenPasswordIsNull() {
        assertThrows(RuntimeException.class, () -> MediumPassword.of(null));
    }

    @Test
    void should_returnErrorMessages_when_passwordDoesNotMatch() {
        assertThat(MediumPassword.of("1AFR_").check())
                .containsExactlyInAnyOrder(
                        "Password should contains a lower case letter",
                        "Password length must be greater than 16"
                );
    }
}
