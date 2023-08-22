package bankAccountApp;

import java.util.ArrayList;
import java.util.List;

public abstract class Account implements IBaseRate {

    //    holding data
    List<Account> accounts = new ArrayList<>();

//    Constructor for set base properties and initialize the account


    public Account() {
        System.out.print("NEW ACCOUNT: ");
    }

    private String name;
    private String digitAccountNumber;
    private int socialSecurityNumber;
    private String accountType;
    private double initialDeposit;


//    deposit

//    withdraw

//    transfer

//    showInfo

//    generate account number
}
