package africa.semicolon.bankingApplication.dtos;

import lombok.Data;

@Data
public class createAccountRequest {
    private String bankId;
    private String firstName;
    private String lastName;
    private String bvn;
    private int numberOfAccount;

}
