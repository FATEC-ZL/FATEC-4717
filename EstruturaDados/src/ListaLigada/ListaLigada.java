/**
 * Classe exemplo de Lista Ligada.
 *
 * @author Andréa Zotovici (modificado por Fernando M. Oliveira (RA 142016-1)
 * @version 14/03/2016
 */
package ListaLigada;

import javax.swing.JOptionPane;

public class ListaLigada {

    private No inicio;

    public ListaLigada() {//Construtor
        inicio = null;
    }

    /**
     * Metodo que verifica se a lista está vazia @return se lista está vazia
     * retorna true caso contrário false
     */
    public boolean vazia() {
        return inicio == null;
    }

    //Método que adiciona um nó com o novo elemento no início da lista
    public void adicionaInicio(int e) {
        No novo = new No(e);
        novo.prox = inicio;
        inicio = novo;
    }

    public void adicionaFinal(int e) {
        if (!(inicio == null)) { // (!vazia()) {
            No aux = inicio;
            while (aux.prox != null) {
                aux = aux.prox;
            }
            aux.prox = new No(e);
        } else {
            inicio = new No(e);
        }
    }

    public void adiciona(int e, int p) {
        No novo = new No(e);
        int c = 0;
        if (vazia()) {
            if (p == 1) {
                inicio = novo;
            } else {
                System.out.println("ERRO!\n\nPosição Inválida!");
                JOptionPane.showMessageDialog(null, "ERRO!\n\nPosição Inválida!");
            }
        } else {
            if (p == 1) { // Adiciona no Início
                novo.prox = inicio;
                inicio = novo;
            } else {
                No aux1 = inicio, aux2 = null;
                while (aux1.prox != null && c < p) {
                    aux2 = aux1;
                    aux1 = aux1.prox;
                    c = c + 1;
                }
                if (aux1.prox == null) {
                    if (c == p - 1) { //Adiciona no Final
                        aux1.prox = novo;
                    } else {
                        System.out.println("ERRO!\n\nPosição Inválida!");
                        JOptionPane.showMessageDialog(null, "ERRO!\n\nPosição Inválida!");
                    }
                } else { //Adiciona no Meio
                    novo.prox = aux1;
                    aux2.prox = novo;
                }
            }
        }
    }

    public void adiciona2(int e, int p) { //VERSAO ANDREIA
        if (p == 1) {
            adicionaInicio(e);
        } else {
            if (vazia()) {
                System.out.println("ERRO! Use a 1a. poição");
                JOptionPane.showMessageDialog(null, "ERRO! Use a 1a. poição");
            } else {
                No aux = inicio;
                int conta = 1;
                while (aux.prox != null && conta < p - 1) {
                    aux = aux.prox;
                    conta++;
                }
                if (conta == p - 1) {
                    No novo = new No(e);
                    novo.prox = aux.prox;
                    aux.prox = novo;
                } else {
                    System.out.println("Posição Não Existe");
                    JOptionPane.showMessageDialog(null, "Posição Não Existe");
                }
            }
        }
    }

    public int removeInicio() {

        int r = -1;
        if (inicio == null) {
            System.out.println("ERRO! Lista Vazia.");
            JOptionPane.showMessageDialog(null, "ERRO!\n\nLista Vazia!");
        } else {
            r = inicio.dado;
            inicio = inicio.prox;
        }
        System.out.println(r);
        return r;
    }

    public int removeFinal() {
        int r = 1;
        if (vazia()) { // if(inicio == null){
            System.out.println("ERRO!\n\nLista Vazia!");
            JOptionPane.showMessageDialog(null, "ERRO!\n\nLista Vazia!");
        } else {
            if (inicio.prox == null) {
                r = inicio.dado;
                inicio = null;
            } else {
                No aux1 = inicio, aux2 = null;
                while (aux1.prox != null) {
                    aux2 = aux1;
                    aux1 = aux1.prox;
                }
                r = aux1.dado;
                aux2.prox = null;
            }
        }
        System.out.println("Numero removido: " + r);
        return r;
    }

    public void remove(int p) {
        int r = 1;
        if (vazia()) { // if(inicio == null){
            System.out.println("ERRO!\n\nLista Vazia!");
            JOptionPane.showMessageDialog(null, "ERRO!\n\nLista Vazia!");
        } else {
            if (inicio.prox == null) {
                r = inicio.dado;
                inicio = null;
            } else {
                No aux1 = inicio, aux2 = null;
                int conta = 1;
                while (aux1.prox != null && conta < p - 1) {
                    aux2 = aux1;
                    conta++;
                }
            }
            System.out.println("Posição Não Existe");
            JOptionPane.showMessageDialog(null, "Posição Não Existe");
        }
        System.out.println("Numero removido: " + r);
    }

    public String percorre() {
        String r = "";
        No aux = inicio;

        while (aux != null) {
            r = r + " " + aux.dado;
            aux = aux.prox;
        }
        System.out.println("Lista: " + r);
        JOptionPane.showMessageDialog(null, "Lista: " + r);
        return r;
    }

//    public void percorre(No aux) {
//        if (aux != null) {
//            System.out.println(" " + aux.dado);
//            percorre(aux.prox);
//        }
//    }
//
//    public No busca(No aux) {
//        if (aux.prox != null) {
//            return busca(aux.prox);
//        }
//        return busca(aux);
//    }
}
