package object;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Currency {
    private String currencyName;
    private String code;
    private char symbol;
}
