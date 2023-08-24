package bankAccountApp;

import utilities.CSV;

import java.io.IOException;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) throws IOException {
        String file = "NewBankAccounts.csv";
//        Read a CSV File then create new accounts based on that data
        List<String[]> newAccountHolders = CSV.read(file);
        for (String[] s : newAccountHolders) {
            String name = s[0];
            String socialSecurityNumber = s[1];
            String accountType = s[2];
            double initialDeposit = Double.parseDouble(s[3]);
            if (accountType.equals("Savings")) {
                Savings savings = new Savings(name, socialSecurityNumber, initialDeposit);
                savings.showInfo();
            } else if (accountType.equals("Checking")) {
                Checking checking = new Checking(name, socialSecurityNumber, initialDeposit);
                checking.showInfo();
            } else {
                System.out.println("Error");
            }
        }

    }
}
