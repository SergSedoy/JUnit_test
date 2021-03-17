import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testInputFloor() {

            assertThrows(NoSuchElementException.class, () -> Main.inputFloor());
    }
}