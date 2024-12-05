package desafio;

import java.util.Date;

public class Contrato {
    String descricao;
    Integer quantHoras;
    Double valorHora;
    Date data;

    public Double valorContrato(){
        return quantHoras * valorHora;
    }

    @Override
    public String toString(){
        return descricao;
    }
}

