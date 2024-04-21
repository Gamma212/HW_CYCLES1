import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrelansServisTest {
    @Test
    public void test1() {
        FrelansServis servis = new FrelansServis();
        int actual = servis.calculate(10_000, 3_000, 20_000);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        FrelansServis servis = new FrelansServis();
        int actual = servis.calculate(100_000, 60_000, 150_000);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
}