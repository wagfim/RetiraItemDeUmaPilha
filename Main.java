package br.edu.ifpr.questao3;
public class Main {
    public static void main(String[] args) {
        Pilha novaPilha = new Pilha();
        
        for (int i = 1; i <= 10; i++) {
            novaPilha.push(i);
        }
        exibePilha(novaPilha);
        removerItemPilha(novaPilha, 2);
        System.out.println();
        exibePilha(novaPilha);
        
    }
    public static void exibePilha(Pilha pilha) {
        Pilha copia = new Pilha();
        copiarPilha(pilha, copia);
        
        System.out.print("[");
        int limite = copia.getTamanho()-1;
        for (int i = 0; i < limite; i++) {
            System.out.print(copia.pop() + ", ");
        }
        System.out.print(copia.pop() + "]");
    }
    
    public static void copiarPilha(Pilha original, Pilha copia) {
        if(original.getTamanho() > 0) {
            String temp = original.pop();
            copiarPilha(original, copia);
            original.push(Integer.parseInt(temp));
            copia.push(Integer.parseInt(temp));
        }
    }
    
    public static void removerItemPilha(Pilha pilha, int item) {
        Pilha auxiliar = new Pilha();
        
        int limite = pilha.getTamanho();
        for (int i = 0; i < limite; i++) {
            String temp = pilha.pop();
            if (!temp.equals("vazio")){
                int valor = Integer.parseInt(temp);
                if(valor == item) {
                    break;
                } else {
                    auxiliar.push(valor);
                }
            }
        }
        limite = auxiliar.getTamanho();
        for (int i = 0; i < limite; i++) {
            int valor = Integer.parseInt(auxiliar.pop());
            pilha.push(valor);
        }  
    }
}

