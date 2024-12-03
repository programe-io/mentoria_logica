package aula10;

import java.util.ArrayList;

public class Produto {

    /* Variáveis: Dados básicos do produto */
    String descricao;
    Double preco;
    Integer quantidade;

    @Override
    public String toString(){
        return String.format("%s - %d", descricao, quantidade);
    }
}
