package Model;

import java.util.ArrayList;
import java.util.Random;

// A very organized and higher level code - Simple project

public class CustomerAccount {

    private int accountBalance;
    private int accountNumber;
    private String accountName;
    private int phoneNo;
    private ArrayList<Transaction> transactionLog;
    private String address;
    private int taxNumber;
    Random rand = new Random();

    public CustomerAccount(String accountName, int phoneNo, String address, int taxNumber) {

        this.accountBalance = 0;
        this.accountName = accountName;
        this.accountNumber = rand.nextInt(1000);
        this.phoneNo = phoneNo;
        this.transactionLog = new ArrayList<>();
        this.address = address;
        this.taxNumber = taxNumber;
        System.out.println("Account created! your account number is" + this.accountNumber);

    }

    public void doTransaction(boolean deposit, int amount) throws InsuffecientBalanceException{
        if ((!deposit) && (this.accountBalance<amount)) {
            throw new InsuffecientBalanceException("Insufficient Balance");
        } else {
            transactionLog.add(new Transaction(amount, this, deposit));
        }
    }






}
