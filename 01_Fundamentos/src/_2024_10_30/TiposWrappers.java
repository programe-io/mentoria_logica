package _2024_10_30;

import java.util.ArrayList;

public class TiposWrappers {
    public static void main(String[] args) {

        /* Tipos wrappers são classes que assumem o comportamento dos tipos primitivos. Temos 7 tipos primitivos no Java, logo temos7 tipos wrappers.
        * Por serem classes, os tipos wrappers apresentam uma série de métodos (ações) que podem ser executados juntos as variáveis declaradas.*/
        Integer numero1 = 10;
        Integer numero2 = 10;

        Boolean resultado2 = numero1.equals(numero2);

        System.out.println(resultado2);

    }
}

