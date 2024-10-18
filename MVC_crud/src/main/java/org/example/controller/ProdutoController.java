package org.example.controller;

import org.example.model.Produto;
import org.example.view.ProdutoView;

import java.util.ArrayList;
import java.util.List;

public class ProdutoController {

    private ProdutoView produtoview;
    private List<Produto> produtos;

    public ProdutoController(ProdutoView novaVisao) {
        this.produtoview = novaVisao;
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto(){
        int id = produtoview.getIdProduto();
        String nome = produtoview.getNomeProduto();
        double preco = produtoview.getPrecoProduto();

        insertProduto(id,nome,preco);
    }

    public void insertProduto(int id,String nome,Double preco){
        Produto novoProduto = new Produto(id,nome,preco);
        produtos.add(novoProduto);
    }

    public Produto buscarProduto(int id){
        for (Produto p : produtos){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public void deletarProduto(){
        int id  = produtoview.getIdProduto();

        Produto produtoDelete = buscarProduto(id);

        if (produtoDelete != null){
            produtos.remove(produtoDelete);
        }
    }

    public void updateProduto(){
        int id = produtoview.getIdProduto();

        Produto produtoUpdate = buscarProduto(id);

        if (produtoUpdate != null){
            String NovoNome = produtoview.getNomeProduto();
            double NovoPreco = produtoview.getPrecoProduto();

            produtoUpdate.setNome(NovoNome);
            produtoUpdate.setPreco(NovoPreco);
        }
    }

    public void imprimirTodos(){
        produtoview.imprimirTodosProdutos(produtos);
    }
}
