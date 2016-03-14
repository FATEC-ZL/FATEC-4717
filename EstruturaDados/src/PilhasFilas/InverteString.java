/**
 * Classe que controla as operações em uma lista LIFO de alocação estática de memória.
 * @author Fernando Moraes Oliveira RA 114016-1
 * @version 29/02/2016
 */
package PilhasFilas;
import javax.swing.JOptionPane;
        
public class InverteString {

    private String[] dados;
    private int tamanho;

    public InverteString(int capacidade) {
        dados = new String[capacidade];
        tamanho = 0;
    }

    public void adiciona(String palavra) {
        String letra;
        if (tamanho == dados.length) {
            JOptionPane.showMessageDialog(null, "ERRO!\nLista Cheia!");
        } else {
            for (int i = tamanho; i < dados.length; i++) {
                letra = palavra.substring(i, i + 1);
                dados[tamanho] = letra;
                tamanho++;
            }
        }
    }

    public void inverte() {

        String r;

        if (tamanho == 0) {
            JOptionPane.showMessageDialog(null, "ERRO!\nLista Vazia!");
        } else {
            for (int i = 0; i < tamanho; i++) {
                r = dados[tamanho - 1];
                for (int j = tamanho - 1; j > 0; j--) {
                    if (j > i) {
                        dados[j] = dados[j - 1];
                    }
                }
                dados[i] = r;
            }
        }
    }

    public String percorre() {

        String resp = "";
        if (tamanho == 0) {
            resp = "nenhum!";
        }
        for (int i = 0; i < tamanho; i++) {
            resp = resp + dados[i] + " ";
        }
        resp = resp + "\n\nPosições ocupadas do vetor: " + (tamanho) + " de ";
        return resp;
    }
}