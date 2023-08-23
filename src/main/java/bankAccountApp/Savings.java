package bankAccountApp;

public class Savings extends Account {


    //    List properties specific to a savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

//    Constructor to initialize savings account properties

    public Savings(String name, String socialSecurityNumber, double initialDeposit) {
        super(name, socialSecurityNumber, initialDeposit);
        digitAccountNumber = "2" + digitAccountNumber;
    }


//    List any methods specific to a savings account
    public void showInfo(){
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Savings");
    }
}
