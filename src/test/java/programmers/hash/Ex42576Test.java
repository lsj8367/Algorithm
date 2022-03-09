package programmers.hash;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex42576Test {

    private Ex42576 ex = new Ex42576();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}, "leo"),
            Arguments.of(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}, "vinko"),
            Arguments.of(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}, "mislav")
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(String[] participant, String[] completion, String expected) {
        final String actual = ex.solution(participant, completion);
        assertThat(actual).isEqualTo(expected);
    }

}