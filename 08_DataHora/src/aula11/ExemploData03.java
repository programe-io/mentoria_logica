package aula11;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExemploData03 {
    public static void main(String[] args) {

        LocalDate minhaData = LocalDate.parse("2024-12-01");
        System.out.println(minhaData);

        LocalDateTime minhaDataHora = LocalDateTime.parse("2024-12-01T20:31:10");
        System.out.println(minhaDataHora);
    }
}

