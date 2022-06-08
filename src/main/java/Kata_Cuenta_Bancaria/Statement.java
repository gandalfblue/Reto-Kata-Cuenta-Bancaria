package Kata_Cuenta_Bancaria;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

public class Statement {

    private final String HEADER = "Date \t\t| Credit \t    | Debit \t| Balance   ";
    private List<String> balance;

    public Statement() {
        this.balance = new LinkedList<String>();
        this.balance.add(HEADER);
    }

    public void lineAdd(Transaction transaction) {
        this.balance.add(1, transaction.addLine());
    }

    public void printTo(PrintStream salida) {
        for (String line : this.balance) {
            salida.println(line);
        }
    }
}
