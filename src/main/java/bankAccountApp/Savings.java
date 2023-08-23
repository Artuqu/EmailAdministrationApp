package bankAccountApp;

import java.util.Random;

public class Savings extends Account {


    //    List properties specific to a savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;
    Random random = new Random();

//    Constructor to initialize savings account properties

    @Override
    public double setRate() {
        return getBaseRate() - .25;
    }

    public Savings(String name, String socialSecurityNumber, double initialDeposit) {
        super(name, socialSecurityNumber, initialDeposit);
        digitAccountNumber = "1" + digitAccountNumber;
        setSafetyDepositBox();
    }


    //    List any methods specific to a savings account
    public void showInfo() {
        super.showInfo();
        System.out.println(" Your Savings Account Features:" +
                "\n Safety Deposit Box ID: " + safetyDepositBoxID
                + "\n Safety Deposit Box Key: " + safetyDepositBoxKey + "\n");
    }


    private void setSafetyDepositBox() {
        safetyDepositBoxID = random.nextInt(100, 999);
        safetyDepositBoxKey = random.nextInt(1000, 9999);
    }
}
