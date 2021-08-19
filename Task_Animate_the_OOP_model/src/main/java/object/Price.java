package object;

public class Price {
    private Currency currency;
    private double sum;

    public Price(Currency currency, double sum) {
        this.currency = currency;
        this.sum = sum;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String makeUpPrice() {
        String price;
        if (this.currency.getSymbol() != ' ') {
            price = String.format("%c %f", this.currency.getSymbol(), this.sum);
        } else {
            price = this.currency.getCode() + this.sum;
        }
        return price;
    }
}
