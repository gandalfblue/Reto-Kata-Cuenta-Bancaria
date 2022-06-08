package Kata_Cuenta_Bancaria;

import java.text.DecimalFormat;

public class Amount {
    private DecimalFormat formatDecimal = new DecimalFormat("#.00");
    private Integer value;

    public Amount(Integer value) {
        this.value = value;
    }

    public static Amount amountOf(Integer value) {
        return new Amount(value);
    }

    public Amount amountAdd(Amount amountOther) {
        return amountOf(this.value + amountOther.value);
    }


    public Amount absoluteValue() {
        return amountOf(Math.abs(this.value));
    }

    public String formatCurrency() {
        return formatDecimal.format(this.value);
    }

    public Amount amountSubs() {
        return amountOf(-value);
    }

    public boolean greaterThan(double comparator) {
        return this.value > comparator;
    }
}
