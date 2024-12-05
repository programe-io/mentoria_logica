package desafio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {

        Scanner input = new Scanner(System.in);
        Historico historico = new Historico();
        SimpleDateFormat formatacaoData = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("1 - Adicionar Contrato");
        System.out.println("2 - Exibir Contratos");
        System.out.println("3 - Ver valores mês");
        System.out.println("4 - Sair");

        while(true){

            System.out.print("Informe sua opção: ");
            int opcao = input.nextInt();

            /* Limpando console */
            input.nextLine();

            if(opcao == 1){
                System.out.print("Informe a descrição do contrato: ");
                String descricao = input.nextLine();
                System.out.print("Informe a data (dd/mm/aaaa): ");
                String data = input.nextLine();
                System.out.print("Informe a quant. horas: ");
                Integer horas = input.nextInt();
                System.out.print("Informe o valor da hora: ");
                Double valorHora = input.nextDouble();

                Contrato novoContrato = new Contrato();
                novoContrato.descricao = descricao;
                novoContrato.data = formatacaoData.parse(data);
                novoContrato.quantHoras = horas;
                novoContrato.valorHora = valorHora;

                historico.adicionarContrato(novoContrato);
            }
            else if(opcao == 2){
                System.out.println(historico.verContratos());
            }
            else if(opcao == 3){

            }
            else if(opcao == 4){
                break;
            }
        }
    }
}

