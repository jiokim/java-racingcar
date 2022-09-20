package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void split() {
        String[] result = "1,2".split(",");
        assertThat(result).contains("1");
    }

    @Test
    void splitString() {
        String[] result = "1,2".split(",");
        assertThat(result).containsExactly("1","2");
    }

    @Test
    void substring() {
        String input = "(1,2)";
        String result = input.substring(1, input.length()-1);
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("특정 위치의 문자를 가져올 때 위치 값을 벗어나면 Exception 발생")
    void stringIndexOutOfBoundsException() {
        String input = "abc";
        assertThatThrownBy(()->{
            char result = input.charAt(4);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range");
    }
}
