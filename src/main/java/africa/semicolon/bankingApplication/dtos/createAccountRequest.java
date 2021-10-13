package africa.semicolon.bankingApplication.dtos;

import lombok.Data;

public class createAccountRequest {
    @Data
    private String bankId;
    private String firstName;
    private String lastName;
    private String bvn;
}
