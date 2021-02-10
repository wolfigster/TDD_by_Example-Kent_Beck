package tdd.money;

import junit.framework.TestCase;

public class FrancTest extends TestCase {

    public void testFrancMultiplication() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }
}
