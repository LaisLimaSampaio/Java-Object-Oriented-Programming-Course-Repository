package org.example;

public class Tarefa {
    private String nome;
    private String prazo;
    private boolean concluida;

    public Tarefa(String nome, String prazo) {
        this.nome = nome;
        this.prazo = prazo;
        this.concluida = false;
    }

    public String getNome() {
        return nome;
    }

    public String getPrazo() {
        return prazo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void concluirTarefa(){
        if(this.concluida == false){
            this.concluida = true;
            System.out.println("A tarefa concluída");
        }else{
            System.out.println("A tarefa já está concluida");
        }
    }

    public void alterarPrazo(String prazo){
        this.prazo = prazo;
        System.out.println("O prazo foi alterado com sucesso para "+this.prazo);
    }

}

