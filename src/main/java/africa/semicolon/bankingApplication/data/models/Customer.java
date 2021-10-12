package africa.semicolon.bankingApplication.data.models;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private List <Account> account = new ArrayList<Account>();
    private Bvn bvn;
    private String firstName;
    private String lastName;
}
