package bankAccountApp;

public class BankAccountApp {

    public static void main(String[] args) {

//        Read a CSV File then create new accounts based on that data

        Checking checking = new Checking("James Wilson", "354963875", 1500);
        checking.showInfo();

        Savings savings = new Savings("Peter Pelican", "123456789", 75);
        savings.showInfo();
    }
}
