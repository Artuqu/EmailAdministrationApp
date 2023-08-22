package bankAccountApp;

public class Checking extends Account {

    //    List properties specific to a checking account
    private int debitCardNumber;
    private int PIN;


//    Constructor to initialize checking account properties

    public Checking(String name, String socialSecurityNumber, double initialDeposit) {
        super(name, socialSecurityNumber, initialDeposit);
        digitAccountNumber = "1" + digitAccountNumber;
        System.out.println("NEW CHECKING ACCOUNT, ACCOUNT NUMBER: " + digitAccountNumber);
    }

//    List any methods specific to a checking account

}
