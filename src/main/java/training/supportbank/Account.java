package training.supportbank;

import java.util.ArrayList;
import java.util.Objects;

public class Account {

    private String name;
    private Monies balance;
    private ArrayList<Transaction> transactions;

    public Account(String name) {
        this.name = name;
        this.balance = new Monies(0);
        transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Monies getBalance() {
        return balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void processTransaction(Transaction transaction) throws InvalidTransactionException {
        if(this.equals(transaction.getSourceAccount())) {
            this.balance.subtract(transaction.getValue());
        } else if (this.equals(transaction.getDestinationAccount())) {
            this.balance.add(transaction.getValue());
        } else {
                throw new InvalidTransactionException("Transaction does not relate to this account");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(name, account.name) &&
                Objects.equals(balance, account.balance) &&
                Objects.equals(transactions, account.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, balance, transactions);
    }
}
