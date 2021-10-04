package object;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Price {
   // private Currency currency;
    private String code;
    private BigDecimal sum;

    public String makeUpPrice() {
        String price;
        if (!this.code.equals(" ")) {
            price = String.format("%c %f", this.code, this.sum);
        } else {
            price = this.code + this.sum;
        }
        return price;
    }
}
