/**
 * Classe que controla as operações em uma fila circular.
 * @author Andréa Zotovici (modificado por Fernando Moraes Oliveira (RA 114016-1)
 * @version 29/02/2016
 */
package PilhasFilas;
import javax.swing.JOptionPane;

public class FilaCircular {

    private int inicio, fim, tamanho, dados[];

    public FilaCircular(int capacidade) {
        dados = new int[capacidade];
        tamanho = 0;
        inicio = 0;
        fim = 0;
    }

    public boolean vazia() {
        return tamanho == 0;
    }

    public boolean cheia() {
        return tamanho == dados.length;
    }

    public void adiciona(int e) {
        /*if(tamanho == dados.length){*/
        if (cheia()) {
            JOptionPane.showMessageDialog(null, "ERRO!\nLista Cheia!");
            System.out.println("Erro! Fila cheia");
        } else {
            dados[fim] = e;
            /*fim++;
             if(fim==dados.length)
             fim=0;*/
            fim = (fim + 1) % dados.length;
            tamanho++;
        }
    }

    public int remove() {
        int r = -1;
        /*if(tamanho == 0){*/
        if (vazia()) {
            JOptionPane.showMessageDialog(null, "ERRO!\nLista Vazia!");
            System.out.println("ERRO! Fila Vazia");
        } else {
            r = dados[inicio];
            /*tamanho--;
            inicio++;
            if(inicio == dados.length)
                inicio = 0;*/
            inicio = (inicio + 1) % dados.length;
            tamanho--;           
        }
        return r;
    }

    public String percorre() {

        String r = "";
        if (tamanho == 0) {
            r = "nenhum!";
        }
        int i = inicio;
        for (int c = 1; c <= tamanho; c++) {
            /*r = r + " " + dados[i];*/
            r = r + dados[i] + " ";
            /*i++;
            if(i == dados.length)
                i = 0;*/
            i = (i + 1) % dados.length;
        }
        r = r + "\n\nTamanho: " + (tamanho) + "\nInício: " + (inicio) + "\nFim: " + (fim);
        return r;
    }
}