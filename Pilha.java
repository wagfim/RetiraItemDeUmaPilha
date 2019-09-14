package br.edu.ifpr.questao3;
public class Pilha {
    private No topo;
    private int tamanho = 0;

    public No getTopo() {
        return topo;
    }

    public void setTopo(No topo) {
        this.topo = topo;
    }

    public int getTamanho() {
        return tamanho;
    }
    
    boolean isEmpty() { //está vazia?
        return topo == null;
    }
    
    void push(int value){ //empilhar
        No novoNo = new No(value);
        if(isEmpty()){
            topo = novoNo;
            tamanho++;
        } else {
            novoNo.setAnterior(topo);
            topo = novoNo;
            tamanho++;
        }     
    }
    String pop(){ //desempilhar
        if(isEmpty()){
            return "vazio";
        } else {
            String temp = Integer.toString(topo.getValor());
            topo = topo.getAnterior();
            tamanho--;
            return temp;
        }  
    }    
}

