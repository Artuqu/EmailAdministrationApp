package bankAccountApp;

import java.util.Random;

public abstract class Account implements IBaseRate {

    public abstract double setRate();

    //    Constructor for set base properties and initialize the account
    public Account(String name, String socialSecurityNumber, double initialDeposit) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.balance = initialDeposit;

        //    set account number
        this.digitAccountNumber = setAccountNumber();
//        update an unique index
        rate = setRate();
        index++;
    }

    private String name;
    String digitAccountNumber;
    private String socialSecurityNumber;
    private double rate;
    private double balance;
    private static int index = 10000;


    //    deposit
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depositing $" + amount);
        showBalance();
    }

    //    withdraw
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawing $" + amount);
        showBalance();
    }

    //    transfer
    public void transfer(String toWhere, double amount) {
        balance -= amount;
        System.out.println("Transferring $" + amount + " to " + toWhere);
        showBalance();
    }

    public void showBalance() {
        System.out.println("Your balance now is: $" + balance);
    }

    //    showInfo
    public void showInfo() {
        System.out.println("Name: " + name + "\nAccount Number: " + digitAccountNumber +
                "\nSocial Security Number: " + socialSecurityNumber +
                "\nRate: " + rate +
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

//    public void compound() {
//        double accruedInterest = balance * (rate / 100);
//        balance += accruedInterest;
//        System.out.println("Accrued Interest is $" + accruedInterest);
//        showBalance();
//    }
}
