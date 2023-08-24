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
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i]);
            }
        }

    }
}
