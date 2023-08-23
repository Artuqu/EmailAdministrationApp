package bankAccountApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Account implements IBaseRate {

    //    holding data
    List<Account> accounts = new ArrayList<>();

    public abstract double setRate();

//    Constructor for set base properties and initialize the account


    public Account(String name, String socialSecurityNumber, double initialDeposit) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.balance = initialDeposit;

        //    set account number
        this.digitAccountNumber = setAccountNumber();
//        update an unique index
        baseRate = setRate();
        index++;
    }

    private String name;
    String digitAccountNumber;
    private String socialSecurityNumber;
    double baseRate;
    private double balance;
    private static int index = 10000;


    //    deposit
    public void deposit() {

    }

    //    withdraw
    public void withdraw() {

    }

    //    transfer
    public void transfer() {

    }

    //    showInfo
    public void showInfo() {
        System.out.println("Name: " + name + "\nAccount Number: " + digitAccountNumber +
                "\nSocial Security Number: " + socialSecurityNumber +
                "\nRate: " + baseRate +
                "\nBalance: " + balance);
    }

    //    generate account number
    private String setAccountNumber() {
        Random r = new Random();
        String random = String.valueOf(r.nextInt(100, 999));
        int stringLength = socialSecurityNumber.length();
        String lastTwoOfSSH = socialSecurityNumber.substring(stringLength - 2, stringLength);

        return lastTwoOfSSH + index + random;
    }
}
