package Testing;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestDiv {

    Calculator c = new Calculator();

    @Test
    public void testDivide() {
        assertEquals(0, c.Divide(10, 0));
    }
}

