import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Price {
    private final Currency currency;
    private final BigDecimal sum;

    public Price(Currency currency, BigDecimal sum) {
        this.currency = currency;
        this.sum = sum;
    }

//    public Currency getCurrency() {
//        return currency;
//    }
//
//    public void setCurrency(Currency currency) {
//        this.currency = currency;
//    }
//
    public BigDecimal getSum() {
        return sum;
    }
//
//    public void setSum(double sum) {
//        this.sum = sum;
//    }

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
