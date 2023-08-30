package es.geeksusma.passwordvalidator.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Iteration2PasswordTest {
    @Test
    void should_returnValid_when_containsMoreThanSixChars_AndCapitalLetter_AndLowerCase() {
        assertThat(Iteration2Password.of(null).check()).isFalse();
        assertThat(Iteration2Password.of("123456").check()).isFalse();
        assertThat(Iteration2Password.of("1Ab234567").check()).isTrue();
    }
}
