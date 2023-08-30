package es.geeksusma.passwordvalidator.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Iteration2PasswordTest {
    @Test
    void should_returnValid_when_containsMoreThanSixteenChars_CapitalLetter_LowerCase_Number_Underscore() {
        assertThat(Iteration2Password.of(null).check()).isFalse();
        assertThat(Iteration2Password.of("1234567891aFvr21w_").check()).isTrue();
        assertThat(Iteration2Password.of("Abcdefg").check()).isFalse();
    }
}
