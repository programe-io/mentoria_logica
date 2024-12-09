package pratica05;



public class Conta {

    /* Variável (atributo) da Conta */
    Double saldo = 0.0;

    /* Funções (métodos) da Conta */
    public Double verSaldo(){
        return saldo;
    }

    public void depositar(Double valor){
        saldo += valor; // saldo = saldo + valor;
    }

    public void sacar(Double valor) throws ExceptionSaldo{
        if(saldo > valor){
            saldo -= valor;
        }
        else{
            throw new ExceptionSaldo("Saldo insuficiente");
        }
    }
}


