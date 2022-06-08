package Kata_Cuenta_Bancaria;

import java.time.LocalDate;

public class Transaction {

    private Amount amount;
    private Amount balance;
    private LocalDate date;

    public Transaction(Amount amount, LocalDate date) {
        this.amount = amount;
        this.date = date;
    }

    public Amount balanceTransactionLater(Amount currentBalance) {
        this.balance = currentBalance.amountAdd(this.amount);
        return currentBalance.amountAdd(this.amount);
    }

    public String addLine() {
        StringBuilder builder = new StringBuilder();
        String dateLocal = dateChange(this.date);
        builder.append(dateLocal);
        builder.append("\t|");
        if (!this.amount.greaterThan(0)) {
            builder.append("\t\t\t\t|");
            builder.append(this.amount.formatCurrency());
            builder.append("\t\t|");
            builder.append(this.balance.formatCurrency());
            return builder.toString().replace("-", "");
        }
        builder.append(this.amount.formatCurrency());
        builder.append("\t\t|\t\t\t|");
        builder.append(this.balance.formatCurrency());

        return builder.toString();
    }

    private static String dateChange(LocalDate date) {
        String dateChange = String.valueOf(date);
        dateChange = dateChange.replace("-", "/");
        return dateChange;
    }
}
