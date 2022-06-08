package Kata_Cuenta_Bancaria;

import java.io.PrintStream;
import java.time.LocalDate;

public class Account {
    private Statement statement;
    private Amount balance = Amount.amountOf(0);

    public Account(Statement statement) {
        this.statement = statement;
    }

    public void deposit(Amount value, LocalDate date) {
        transactionSave(value, date);
    }

    public void withdrawal(Amount value, LocalDate date) {
        transactionSave(value.amountSubs(), date);
    }

    public void printStatement(PrintStream printer) {
        statement.printTo(printer);
    }

    private void transactionSave(Amount value, LocalDate date) {
        Transaction transaction = new Transaction(value, date);
        Amount amountTransactionLater = transaction.balanceTransactionLater(balance);
        balance = amountTransactionLater;
        statement.lineAdd(transaction);
    }
}
