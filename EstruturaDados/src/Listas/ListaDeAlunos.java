/**
 * Classe que controla as operações em uma fila circular com objetos.
 *
 * @author Andréa Zotovici (modificado por Fernando M. Oliveira (RA 114016-1)
 * @version 07/03/2016
 */
package Listas;

import javax.swing.JOptionPane;

public class ListaDeAlunos {

    private Aluno dados[];
    private int tamanho;

    public ListaDeAlunos(int capacidade) {
        dados = new Aluno[capacidade];
        tamanho = 0;
    }
    
    public void adicionaInicio(Aluno e) {
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

    public void adicionaFinal(Aluno e) {

        if (tamanho == dados.length) {
            System.out.println("ERRO! LISTA CHEIA!");
            JOptionPane.showMessageDialog(null, "ERRO!\nLista Cheia!");
        } else {
            dados[tamanho] = e;
            tamanho++;
        }
    }
    
    public Aluno removeInicio() {
        Aluno r = null;
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
    
    public Aluno removeFinal(){
        Aluno r = null;
        if(tamanho == 0){
            System.out.println("ERRO! LISTA VAZIA!");
            JOptionPane.showMessageDialog(null, "ERRO!\nLista Vazia!");
        } else {
            r = dados[tamanho-1];
            tamanho--;
        }
        return r;
    }
    
    public String percorre() {
        String r = "";
        for (int i = 0; i < tamanho; i++) {
            //r = r + " " + dados[i].getRa() + " " + dados[i].getNome() + "\n ";
            r = r + " " + dados[i].toString();
        }
        //System.out.println("Devolve: " + r);
        //JOptionPane.showMessageDialog(null, "Devolve: " + r);
        return r;
    }
    
    public void main (String args[]){//TESTE
        ListaDeAlunos l1 = new ListaDeAlunos(4);
        Aluno a = new Aluno (1111111, "Aluno AAA");
        Aluno b = new Aluno (2222222, "Aluno BBB");
        Aluno c = new Aluno (3333333, "Aluno CCC");
        
        l1.adicionaFinal(b);
        l1.adicionaFinal(c);
        l1.adicionaInicio(a);
        System.out.println(l1.percorre());
    }
}