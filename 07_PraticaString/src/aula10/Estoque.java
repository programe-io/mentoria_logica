package aula10;

import java.util.ArrayList;

public class Estoque {

    /* Armazenar um conjunto de Produto */
    ArrayList<Produto> listaProdutos = new ArrayList<>();

    public void adicionar(Produto produto){
        listaProdutos.add(produto);
    }

    public ArrayList<Produto> mostrarProdutos(){
        return listaProdutos;
    }

    public Produto buscarProduto(String descricao){
        for(int indice = 0; indice < listaProdutos.size(); indice++){
            Produto produto = listaProdutos.get(indice);

            if(produto.descricao.equalsIgnoreCase(descricao)){
                return produto;
            }
        }
        return null;
    }

    public Produto atualizarEstoque(String descricao, Integer quant){
        Produto produto = buscarProduto(descricao);

        if(produto != null){
            produto.quantidade += quant;
            return produto;
        }
        return null;
    }
}


