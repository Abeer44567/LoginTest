package Testing;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestSub{

    Calculator c = new Calculator();

    @Test
    public void testSubtract() {
        assertEquals(5, c.Subtract(10, 5));
    }
}

