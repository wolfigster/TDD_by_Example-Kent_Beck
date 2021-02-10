package tdd.money;

import junit.framework.TestCase;

public class FrancTest extends TestCase {

    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}
