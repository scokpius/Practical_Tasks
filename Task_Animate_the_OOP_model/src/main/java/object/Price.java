package object;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Price {
    private Currency currency;
    private BigDecimal sum;

    public Price(Currency currency, BigDecimal sum) {
        this.currency = currency;
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
