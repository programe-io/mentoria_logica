package aula11;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExemploData09 {
    public static void main(String[] args) {

        LocalDate dataAtual = LocalDate.now();
        LocalDate dataPassada = LocalDate.parse("2018-10-15");
        Duration duracao = Duration.between(dataAtual.atStartOfDay(), dataPassada.atStartOfDay());

        System.out.println(duracao);

        // LocalDateTime dataAtual = LocalDateTime.now();
        // LocalDateTime dataPassada = LocalDateTime.parse("2018-10-25T23:55:10");
        // Duration duracao = Duration.between(dataAtual, dataPassada);
        // System.out.println(dataAtual.getMinute());
    }
}
