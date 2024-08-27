package org.example;

public class Pontuacao {
    private int pontos;

    public void adicionarPontos(int pontos) {
        this.pontos += pontos;
        System.out.println("Pontuação adicionada: " + pontos);
    }
    public void removerPontos(int pontos) {
        if((this.pontos - pontos) >= 0) {
            this.pontos -= pontos;
            System.out.println("Removeu-se "+pontos+". Agora a pontuação fica "+this.pontos);
        }else{
            System.out.println("Não é possível obter-se pontuação negativa\nA pontuação atual é de "+this.pontos+" pontos, subtraindo "+pontos+ " ficaria "+ (this.pontos - pontos) );
        }
    }

    public int getPontuacao() {
        return pontos;
    }

}


