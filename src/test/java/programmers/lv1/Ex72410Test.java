package programmers.lv1;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex72410Test {

    private final Ex72410 ex = new Ex72410();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of("...!@BaT#*..y.abcdefghijklm", "bat.y.abcdefghi"),
            Arguments.of("z-+.^.", "z--"),
            Arguments.of("=.=", "aaa"),
            Arguments.of("123_.def", "123_.def"),
            Arguments.of("abcdefghijklmn.p", "abcdefghijklmn")
        );
    }

    @Test
    @DisplayName("알파벳은 소문자로 전부 치환한다.")
    void toLowerCase() {
        assertionsSolution("A1AA", "a1aa");
    }

    @Test
    @DisplayName("소문자, 숫자, -_. 를 제외한 모든 문자 제거")
    void toLowerCaseAll() {
        assertionsSolution("Aa.123-_&^%", "aa.123-_");
    }

    @Test
    void 두개의_마침표_하나로_치환() {
        assertionsSolution("Aa..123-_!&*^@#", "aa.123-_");
    }

    @Test
    void 문자열_앞_뒤_마침표_제거() {
        assertionsSolution(".Aa..123-_!&*^@#.", "aa.123-_");
    }

    @Test
    @DisplayName("공백이라면 a로 변경")
    void isEmptyReturnA() {
        assertionsSolution("", "aaa");
    }

    @Test
    @DisplayName("공백이라면 a로 변경")
    void totalLengthBiggerThanFifteen() {
        assertionsSolution("asddddasweascx.111", "asddddasweascx");
    }

    @Test
    @DisplayName("2자 이하일 때 3글자 이상 될때까지 맨 끝문자열 붙이기")
    void twoLetter() {
        assertionsSolution("as", "ass");
    }

    private void assertionsSolution(final String newId, final String expected) {
        assertThat(ex.solution(newId)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource
    void solution(String newId, String expected) {
        assertThat(ex.solution(newId)).isEqualTo(expected);
    }

}