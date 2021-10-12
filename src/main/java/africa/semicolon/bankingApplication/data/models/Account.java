package africa.semicolon.bankingApplication.data.models;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class Account {
    private final BigDecimal balance = BigDecimal.ZERO;
    private String customerId;
    private String number;
    private accountType type;
}
