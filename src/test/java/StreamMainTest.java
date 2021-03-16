import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class StreamMainTest {

    @Test
    void test1() {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> expectedList = Arrays.asList(1, 2, 5, 16, 32, 3, 5, 8, 23, 4);

        List<Integer> actualList = intList.stream()
                .filter(x -> x > 0)
                .collect(Collectors.toList());

        assertEquals(expectedList, actualList);
    }

    @Test
    void test2() {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, 32, 3, 5, 8, 23, 4);
        List<Integer> expectedList = Arrays.asList(2, 16, 32, 8, 4);

        List<Integer> actualList = intList.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        assertEquals(expectedList, actualList);
    }

    @Test
    void test3() {
        List<Integer> intList = Arrays.asList(2, 16, 32, 8, 4);
        List<Integer> expectedList = Arrays.asList(2, 4, 8, 16, 32);

        List<Integer> actualList = intList.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        assertEquals(expectedList, actualList);
    }
}