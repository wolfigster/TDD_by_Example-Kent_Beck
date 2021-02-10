package tdd.money;

public class Franc extends Money {
    private String currency;

    public Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = "CHF";
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier, null);
    }

    @Override
    String currency() {
        return currency;
    }
}
