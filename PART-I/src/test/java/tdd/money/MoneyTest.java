package tdd.money;

import junit.framework.TestCase;

public class MoneyTest extends TestCase {

    public void testMoneyEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
