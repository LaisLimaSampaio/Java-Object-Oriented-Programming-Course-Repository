package org.example.view;

import org.example.model.Produto;

import java.util.List;
import java.util.Scanner;

public class ProdutoView {
    Scanner scan = new Scanner(System.in);

    public int getIdProduto() {
        System.out.println("Digite o id do produto: ");
        return scan.nextInt();
    }

    public String getNomeProduto() {
        System.out.println("Digite o nome do produto: ");
        return scan.next();
    }

    public double getPrecoProduto() {
        System.out.println("Digite o preco do produto: ");
        return scan.nextDouble();
    }

    //output

    public void imprimirTodosProdutos(List<Produto> produtos){
        for(Produto p: produtos){
            p.toString();
        }
    }
}
