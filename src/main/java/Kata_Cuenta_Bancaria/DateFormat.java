package Kata_Cuenta_Bancaria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {

    private static final String DATEFORMAT = "dd/MM/yyyy";

    public static LocalDate date(String date) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATEFORMAT);
        return LocalDate.parse(date, formatter);
    }
}
