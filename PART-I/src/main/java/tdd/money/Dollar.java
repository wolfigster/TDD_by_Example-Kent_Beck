package tdd.money;

public class Dollar extends Money {
    private String currency;

    public Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

    @Override
    String currency() {
        return currency;
    }
}
