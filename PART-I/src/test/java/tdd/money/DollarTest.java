package tdd.money;

import junit.framework.TestCase;

public class DollarTest extends TestCase {

    public void testDollarMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }
}
