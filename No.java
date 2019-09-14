package br.edu.ifpr.questao3;
public class No {
    private int valor;
    private No anterior;

    public No(int valor) {
        this.valor = valor;
        anterior = null;
    }

    public int getValor() {
        return valor;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }  
}

