package es.geeksusma.passwordvalidator.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MediumPasswordTest {
    @Test
    void should_returnValid_when_containsMoreThanSixteenChars_CapitalLetter_LowerCase_Number_Underscore() {
        assertThat(MediumPassword.of(null).check()).isFalse();
        assertThat(MediumPassword.of("1234567891aFvr21w_").check()).isTrue();
        assertThat(MediumPassword.of("Abcdefg").check()).isFalse();
    }
}
