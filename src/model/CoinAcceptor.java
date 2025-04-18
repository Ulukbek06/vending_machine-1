package model;

public class CoinAcceptor implements PaymentAcceptor {
    private int amount;

    public CoinAcceptor(int initialAmount) {
        this.amount = initialAmount;
    }

    public CoinAcceptor() {
        this.amount = 0;
    }

    @Override
    public void acceptPayment() {
        amount += 10;
        System.out.println("Вы пополнили баланс на 10 монет.");
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void reset() {
        this.amount = 0;
    }
}
