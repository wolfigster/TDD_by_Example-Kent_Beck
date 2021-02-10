package tdd.money;

import junit.framework.TestCase;

public class MoneyTest extends TestCase {

    public void testMoneyEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));

        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));

        assertFalse(new Franc(5).equals(Money.dollar(5)));
    }
}
