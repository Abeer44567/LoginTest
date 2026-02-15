package Testing;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestSum {

    @Test
    public void TestSum1() {
        Calculator c = new Calculator();
        int result = c.Sum(3, 8);
        assertEquals(11, result);
    }
}




