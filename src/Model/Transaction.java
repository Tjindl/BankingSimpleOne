package Model;

import java.util.Date;

public class Transaction {

    private Date date;
    private boolean deposit;
    private int amount;
    private CustomerAccount account;

    public Transaction(int amount, CustomerAccount account, boolean deposit) {

        this.date = new Date();
        this.deposit = deposit;
        this.amount = amount;
        this.account = account;

    }



}
