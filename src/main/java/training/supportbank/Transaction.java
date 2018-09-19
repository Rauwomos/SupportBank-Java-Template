package training.supportbank;

import java.util.Date;

public class Transaction {

    private Account sourceAccount;
    private Account destinationAccount;
    private Date date;
    private Monies value;
    private String narrative;

    public Transaction(Account sourceAccount, Account destinationAccount, Monies value, String narrative, Date date) {
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.value = value;
        this.date = date;
        this.narrative = narrative;
    }

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public Account getDestinationAccount() {
        return destinationAccount;
    }

    public Date getDate() {
        return date;
    }

    public String getNarrative() {
        return narrative;
    }

    public Monies getValue() {
        return value;
    }
}
