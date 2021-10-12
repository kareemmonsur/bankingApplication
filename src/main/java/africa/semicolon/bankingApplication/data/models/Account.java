package africa.semicolon.bankingApplication.data.models;

import java.math.BigDecimal;

public class Account {
    private String number;
    private accountType type;
    private final BigDecimal balance = BigDecimal.ZERO;
}
