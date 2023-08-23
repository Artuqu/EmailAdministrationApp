package bankAccountApp;

import java.util.Random;

public class Checking extends Account {

    //    List properties specific to a checking account
    private String debitCardNumber;
    private String firstFourDigits = "4510";
    private int debitCardPIN;
    Random random = new Random();



//    Constructor to initialize checking account properties

    @Override
    public double setRate() {
    return getBaseRate() * .15;
    }

    public Checking(String name, String socialSecurityNumber, double initialDeposit) {
        super(name, socialSecurityNumber, initialDeposit);
        digitAccountNumber = "2" + digitAccountNumber;
        setDebitCard();
    }


    //    List any methods specific to a checking account
    public void showInfo() {
        super.showInfo();
        System.out.println(" Your Checking Account Features:" +
                "\n Debit Card Number: " + debitCardNumber+
                "\n Debit Card PIN: " + debitCardPIN);
        System.out.println();
    }

    private void setDebitCard() {
        debitCardNumber = firstFourDigits + random.nextInt(10000000, 99999999);
        debitCardPIN = random.nextInt(1000, 9999);
    }

}
