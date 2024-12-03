package aula11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ExemploData01 {
    public static void main(String[] args) {

        /* Inicializando uma data agora */
        LocalDate data = LocalDate.now();

        /* Inicializando uma data e hora do agora */
        LocalDateTime dataTime = LocalDateTime.now();

        System.out.println(data);
        System.out.println(dataTime);
    }
}
