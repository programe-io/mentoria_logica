package aula11;

import java.time.LocalDate;
import java.time.Period;

public class ExemploDate10 {
    public static void main(String[] args) {

        LocalDate dataAtual = LocalDate.now();
        LocalDate dataAnterior = LocalDate.parse("2020-10-15");

        Period periodo = Period.between(dataAtual, dataAtual);
        System.out.println(periodo.getYears());

    }
}
