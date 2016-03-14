package Listas;

import javax.swing.JOptionPane;

/**
 * Classe que controla as operações em uma lista de alocação estática de
 * memória.
 *
 * @author Andréa Zotovici
 * @version 20/08/2012
 */
public class Lista {

    private int dados[];
    private int tamanho;

    public Lista(int capacidade) {
        dados = new int[capacidade];
        tamanho = 0;
    }

    public int remove(int p) {
        int resp = -1;
        if (tamanho == 0) {
            System.out.println("ERRO! LISTA VAZIA!");
            JOptionPane.showMessageDialog(null, "ERRO! LISTA VAZIA!");
        } else {
            if (p >= 1 && p <= tamanho) {
                resp = dados[p - 1];
                for (int i = p - 1; i < tamanho - 1; i++) {
                    dados[i] = dados[i + 1];
                }
                tamanho--;
            } else {
                System.out.println("ERRO! Posição Inválida!");
                JOptionPane.showMessageDialog(null, "ERRO! Posição Inválida!");
            }
        }
        return resp;
    }

    public void adicionaInicio(int e) {
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

    public void adicionaFinal(int e) {
        if (tamanho == dados.length) {
            System.out.println("ERRO! LISTA CHEIA!");
            JOptionPane.showMessageDialog(null, "ERRO! LISTA CHEIA!");
        } else {
            dados[tamanho] = e;
            tamanho++;
        }
    }

    public int removeInicio() {
        int r = -1;
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
        return r;
    }

    public int removeFinal() {
        int r = -1;
        if (tamanho == 0) {
            System.out.println("ERRO! LISTA VAZIA!");
            JOptionPane.showMessageDialog(null, "ERRO! LISTA VAZIA!");
        } else {
            r = dados[tamanho - 1];
            tamanho--;

        }
        return r;
    }

    public String percorre() {
        String r = "";
        for (int i = 0; i < tamanho; i++) {
            r = r + dados[i] + " ";
        }
        System.out.println("Devolve: " + r);
        JOptionPane.showMessageDialog(null, "Devolve: " + r);
        return r;
    }
}