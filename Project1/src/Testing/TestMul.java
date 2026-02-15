package Testing;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestMul {

    Calculator c = new Calculator();

    @Test
    public void testMultiply() {
        assertEquals(12, c.Multiply(3, 4));
    }
}
