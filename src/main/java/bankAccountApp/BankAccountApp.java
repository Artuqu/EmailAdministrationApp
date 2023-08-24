package bankAccountApp;

import utilities.CSV;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    //    holding data
    static List<Account> accountList = new LinkedList<>();

    public static void main(String[] args) throws IOException {


//        Read a CSV File then create new accounts based on that data
        String file = "NewBankAccounts.csv";
        List<String[]> newAccountHolders = CSV.read(file);
        for (String[] s : newAccountHolders) {
            String name = s[0];
            String socialSecurityNumber = s[1];
            String accountType = s[2];
            double initialDeposit = Double.parseDouble(s[3]);
            if (accountType.equals("Savings")) {
                Savings savings = new Savings(name, socialSecurityNumber, initialDeposit);
                accountList.add(savings);
//                savings.showInfo();
            } else if (accountType.equals("Checking")) {
                Checking checking = new Checking(name, socialSecurityNumber, initialDeposit);
                accountList.add(checking);
//                checking.showInfo();
            } else {
                System.out.println("Error");
            }
        }


        for (Account a : accountList) {
            System.out.println("**************************");
            a.showInfo();
        }
    }

}

