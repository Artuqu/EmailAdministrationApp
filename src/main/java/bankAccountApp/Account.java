package bankAccountApp;

import java.util.ArrayList;
import java.util.List;

public abstract class Account implements IBaseRate {

    //    holding data
    List<Account> accounts = new ArrayList<>();

//    Constructor for set base properties and initialize the account


    public Account(String name, String socialSecurityNumber, double initialDeposit) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.balance = initialDeposit;
        System.out.print("NAME: " + name + ", SSN: " + socialSecurityNumber + ", BALANCE: $" + balance + ", ACCOUNT: ");
    }

    private String name;
    private String digitAccountNumber;
    private String socialSecurityNumber;
    private double accountType;
    private double balance;

//    private double balance;


//    deposit

//    withdraw

//    transfer

//    showInfo

//    generate account number
}
