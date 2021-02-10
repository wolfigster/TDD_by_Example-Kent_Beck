package tdd.money;

public class Dollar extends Money {
    private String currency;

    public Dollar(int amount) {
        this.amount = amount;
        this.currency = "USD";
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    String currency() {
        return currency;
    }
}
