package bankAccountApp;

public class Savings extends Account {


//    List properties specific to a savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

//    Constructor to initialize savings account properties

    public Savings(String name, String socialSecurityNumber, double initialDeposit) {
        super(name, socialSecurityNumber, initialDeposit);
        System.out.println("NEW SAVINGS ACCOUNT");
    }


//    List any methods specific to a savings account
}
