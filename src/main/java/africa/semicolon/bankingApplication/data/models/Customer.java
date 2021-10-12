package africa.semicolon.bankingApplication.data.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Customer {
    private Bvn bvn;
    private List <Account> account = new ArrayList<Account>();
    private String firstName;
    private String lastName;
}
