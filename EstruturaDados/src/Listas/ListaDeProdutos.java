/**
 * Classe que controla as operações em uma fila circular com objetos.
 *
 * @author Andréa Zotovici (modificado por Fernando M. Oliveira (RA 114016-1)
 * @version 14/03/2016
 */
package Listas;

import javax.swing.JOptionPane;

public class ListaDeProdutos {

    private Produto dados[];
    private int tamanho;

    public ListaDeProdutos(int capacidade) {
        dados = new Produto[capacidade];
        tamanho = 0;
    }
    
    public void adicionaInicio(Produto e) {
        if (tamanho == dados.length) {
            System.out.println("ERRO! LISTA CHEIA!");
            JOptionPane.showMessageDialog(null, "ERRO! LISTA CHEIA!");
        } else {
            for (int i = tamanho; i > 0; i--) {
                dados[i] = dados[i - 1];
            }
            dados[0] = e;
            tamanho++;
        }
    }

    public void adicionaFinal(Produto e) {

        if (tamanho == dados.length) {
            System.out.println("ERRO! LISTA CHEIA!");
            JOptionPane.showMessageDialog(null, "ERRO!\nLista Cheia!");
        } else {
            dados[tamanho] = e;
            tamanho++;
        }
    }
    
    public Produto removeInicio() {
        Produto r = null;
        if (tamanho == 0) {
            System.out.println("ERRO! Lista Vazia!");
            JOptionPane.showMessageDialog(null, "ERRO! Lista Vazia!");
        } else {
            r = dados[0];
            for (int i = 0; i < tamanho - 1; i++) {
                dados[i] = dados[i + 1];
            }
            tamanho--;
        }
        System.out.println("Devolve:\n" + r);
        return r;
    }
    
    public Produto removeFinal(){
        Produto r = null;
        if(tamanho == 0){
            System.out.println("ERRO! LISTA VAZIA!");
            JOptionPane.showMessageDialog(null, "ERRO!\nLista Vazia!");
        } else {
            r = dados[tamanho-1];
            tamanho--;
        }
        System.out.println("Devolve:\n" + r);
        return r;
    }
    
    public String percorre() {
        String r = "";
        for (int i = 0; i < tamanho; i++) {
            //r = r + " " + dados[i].getRa() + " " + dados[i].getNome() + "\n ";
            r = r + dados[i].toString() + "\n\n";
        }
        System.out.println("Vetor:\n" + r);
        return r;
    }
}