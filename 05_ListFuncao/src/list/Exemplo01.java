package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exemplo01 {
    public static void main(String[] args) {

        /* Lista de Inteiros */
        ArrayList<Integer> minhaLista = new ArrayList<>();
        minhaLista.add(10);
        minhaLista.add(5);
        minhaLista.add(85);
        minhaLista.add(0, 25);
        minhaLista.add(4);
        minhaLista.add(1, 65);

        System.out.println(minhaLista);
        minhaLista.clear();
        System.out.println(minhaLista);

        /*-------------------------------------------------------*/
        LinkedList<Integer> minhaLista2 = new LinkedList<>();
    }
}
