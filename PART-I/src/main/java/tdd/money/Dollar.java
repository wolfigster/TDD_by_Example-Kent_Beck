package tdd.money;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier, "USD");
    }

    @Override
    String currency() {
        return currency;
    }
}
