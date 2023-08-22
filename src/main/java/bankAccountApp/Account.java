package bankAccountApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Account implements IBaseRate {

    //    holding data
    List<Account> accounts = new ArrayList<>();

//    Constructor for set base properties and initialize the account


    public Account(String name, String socialSecurityNumber, double initialDeposit) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.balance = initialDeposit;

        //    set account number
        this.digitAccountNumber = setAccountNumber();
        System.out.print("NAME: " + name + ", SSN: " + socialSecurityNumber
                + ", BALANCE: $" + balance + ", ACCOUNT: ");
        index++;

    }

    private String name;
    String digitAccountNumber;
    private String socialSecurityNumber;
    private double accountType;
    private double balance;

    private static int index = 10000;

//    private double balance;


//    deposit

//    withdraw

//    transfer

//    showInfo

//    generate account number

    private String setAccountNumber() {
        Random r = new Random();
        String random = String.valueOf(r.nextInt(100,999));
        int stringLength = socialSecurityNumber.length();
        String lastTwoOfSSH = socialSecurityNumber.substring(stringLength - 2, stringLength);

        return lastTwoOfSSH + index + random;
    }
}
