package tdd.money;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier, currency);
    }

    @Override
    String currency() {
        return currency;
    }
}
