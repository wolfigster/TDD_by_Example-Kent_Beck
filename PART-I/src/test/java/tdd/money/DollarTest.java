package tdd.money;

import junit.framework.TestCase;

public class DollarTest extends TestCase {

    public void testDollarMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }
}
