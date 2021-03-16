import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testScanner() {
        Scanner scanner = new Scanner(System.in);
            assertThrows(NoSuchElementException.class, scanner::next);

    }

}