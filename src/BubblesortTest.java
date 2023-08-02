import org.junit.Test;

import static org.junit.Assert.*;

public class BubblesortTest {

    @Test
    public void testSort() {
        String[] input = {"max21", "an1on7", "jane123", "user456", "alpha22", "beta99", "gamma123", "test007"};
        String[] expectedOutput = {"alpha22", "an1on7", "beta99", "gamma123", "jane123", "max21", "test007", "user456"};
        String[] output = Bubblesort.sort(input);

        assertArrayEquals(expectedOutput, output);
    }
}