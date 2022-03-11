package programmers.hash;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex42577Test {

    private final Ex42577 ex = new Ex42577();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new String[]{"119", "97674223", "1195524421"}, false),
            Arguments.of(new String[]{"123", "456", "789"}, true),
            Arguments.of(new String[]{"12", "123", "1235", "567", "88"}, false)
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(String[] phoneBook, boolean expected) {
        final boolean actual = ex.solution(phoneBook);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

}