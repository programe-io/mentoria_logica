package aula11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ExemploData08 {
    public static void main(String[] args) {

        LocalDate data = LocalDate.parse("2022-10-25");

        LocalDate dataPosterior = data.plus(25, ChronoUnit.YEARS);
        System.out.println(dataPosterior);
    }
}
