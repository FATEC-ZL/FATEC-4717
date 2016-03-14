/**
 * Classe que controla as operações em uma lista FIFO de alocação estática de memória.
 * @author Fernando Moraes Oliveira RA 114016-1
 * @version 29/02/2016
 */
package PilhasFilas;
import javax.swing.JOptionPane;

public class Fila {

    private int[] dados;
    private int tamanho;

    public Fila(int capacidade) {
        dados = new int[capacidade];
        tamanho = 0;
    }

    public void adiciona(int e) {
        if (tamanho == dados.length) {
            System.out.println("ERRO! LISTA CHEIA!");
            JOptionPane.showMessageDialog(null, "ERRO!\nLista Cheia!");
        } else {
            dados[tamanho] = e;
            tamanho++;
        }
    }

    public int remove() {
        int r = -1;
        if (tamanho == 0) {
            System.out.println("ERRO! LISTA VAZIA!");
            JOptionPane.showMessageDialog(null, "ERRO!\nLista Vazia!");
        } else {
            r = dados[0];
            for (int i = 0; i < tamanho - 1; i++) {
                dados[i] = dados[i + 1];
            }
            tamanho--;
        }
        return r;
    }

    public String percorre() {

        String resp = "";
        if (tamanho == 0) {
            resp = "nenhum!";
        }
        for (int i = 0; i < tamanho; i++) {
            resp = resp + dados[i] + " ";
        }
        System.out.println("Devolve: " + resp);
        resp = resp + "\n\nTamanho: " + (tamanho);
        return resp;
    }
}