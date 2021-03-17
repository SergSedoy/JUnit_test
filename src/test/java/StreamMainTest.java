import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class StreamMainTest {

    @Test
    void testPositivList() {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> expected = Arrays.asList(1, 2, 5, 16, 32, 3, 5, 8, 23, 4);

        List<Integer> actualResult = StreamMain.streamFilterPositiv(intList);

        assertEquals(expected, actualResult);
    }

    @Test
    void testEvenList() {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, 32, 3, 5, 8, 23, 4);
        List<Integer> expected = Arrays.asList(2, 16, 32, 8, 4);

        List<Integer> actualResult = StreamMain.streamFilterEven(intList);

        assertEquals(expected, actualResult);
    }

    @Test
    void testStreamSorted() {
        List<Integer> intList = Arrays.asList(2, 16, 32, 8, 4);
        List<Integer> expected = Arrays.asList(2, 4, 8, 16, 32);

        List<Integer> actualResult = StreamMain.streamSorted(intList);

        assertEquals(expected, actualResult);
    }
}