/*
 * 29/02/2016 Submenu de Acesso de Pilhas e Filas
 * @author 142016-1-Fernando Moraes Oliveira
 */
package PilhasFilas;

import javax.swing.JOptionPane;

public class Submenu03 {

    public static void main(String args[]) {

        int opt;
        int qtPosicoes;
        int n;
        String s;
       
        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma Opção:\n\n"
                    + "01 - Fila (FIFO)\n"
                    + "02 - Pilha (LIFO)\n"
                    + "03 - Fila Circular\n"
                    + "04 - Inverte String\n"
                    + "00 - FIM\n\n"));
            switch (opt) {
                case 1: //FIFO
                    qtPosicoes = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos itens a Fila comportará: \n\n"));
                    Fila fifo = new Fila(qtPosicoes);

                    do {
                        opt = Integer.parseInt(JOptionPane.showInputDialog(
                                "FILA (LIFO):\n\n"
                                + "01 - Adiciona\n"
                                + "02 - Remove\n"
                                + "03 - Percorre\n\n"
                                + "00 - FIM\n\n"));
                        switch (opt) {
                            case 1:/*Adiciona*/
                                n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
                                fifo.adiciona(n);
                                System.out.println("Vetor: " + fifo.percorre());
                                JOptionPane.showMessageDialog(null, "Vetor: " + fifo.percorre());
                                break;
                            case 2:/*Remove*/
                                System.out.println("Vetor: " + fifo.percorre() + "\nDevolve: " + fifo.remove());
                                JOptionPane.showMessageDialog(null, "Vetor: " + fifo.percorre() + "\nDevolve: " + fifo.remove());
                                break;
                            case 3:/*Percorre*/
                                System.out.println("Vetor: " + fifo.percorre());
                                JOptionPane.showMessageDialog(null, "Vetor: " + fifo.percorre());
                                break;
                            case 4://Fim
                                    /*JOptionPane.showMessageDialog(null, "Fim do programa!");*/
                                break;
                            case 0:
                                break;
                            default:/*Tratamento de Erro*/  
                                System.out.println("Por favor, escolha as Opções do Menu!");
                                JOptionPane.showMessageDialog(null, "Por favor, escolha as Opções do Menu!");
                                break;
                        }
                    } while (opt != 0);
                    break;
                    
                 case 2: //LIFO
                    qtPosicoes = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos itens a Pilha comportará: \n\n"));
                    Pilha lifo = new Pilha(qtPosicoes);

                    do {
                        opt = Integer.parseInt(JOptionPane.showInputDialog(
                                "PILHA (LIFO):\n\n"
                                + "01 - Adiciona\n"
                                + "02 - Remove\n"
                                + "03 - Percorre\n\n"
                                + "00 - FIM\n\n"));
                        switch (opt) {
                            case 1:/*Adiciona*/

                                n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
                                lifo.adiciona(n);
                                System.out.println("Vetor: " + lifo.percorre());
                                JOptionPane.showMessageDialog(null, "Vetor: " + lifo.percorre());
                                break;
                            case 2:/*Remove*/
                                System.out.println("Vetor: " + lifo.percorre() + "\nDevolve: " + lifo.remove());
                                JOptionPane.showMessageDialog(null, "Vetor: " + lifo.percorre() + "\nDevolve: " + lifo.remove());
                                break;
                            case 3:/*Percorre*/
                                System.out.println("Vetor: " + lifo.percorre());
                                JOptionPane.showMessageDialog(null, "Vetor: " + lifo.percorre());
                                break;
                            case 0:
                                break;
                            default:/*Tratamento de Erro*/
                                System.out.println("Por favor, escolha as Opções do Menu!");
                                JOptionPane.showMessageDialog(null, "Por favor, escolha as Opções do Menu!");
                                break;
                        }
                    } while (opt != 0);
                    break;
                     
                case 3: //FILA CIRCULAR
                    qtPosicoes = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos itens a Lista Circular comportará: \n\n"));
                    FilaCircular circular = new FilaCircular(qtPosicoes);

                    do {
                        opt = Integer.parseInt(JOptionPane.showInputDialog(
                                "LISTA CIRCULAR:\n\n"
                                + "01 - Adiciona\n"
                                + "02 - Remove\n"
                                + "03 - Percorre\n\n"
                                + "00 - FIM\n\n"));
                        switch (opt) {
                            case 1:/*Adiciona*/

                                n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
                                circular.adiciona(n);
                                System.out.println("Vetor: " + circular.percorre());
                                JOptionPane.showMessageDialog(null, "Vetor: " + circular.percorre());
                                break;
                            case 2:/*Remove*/
                                System.out.println("Devolve: " + circular.remove());
                                System.out.println("Vetor: " + circular.percorre());
                                JOptionPane.showMessageDialog(null, "Vetor: " + circular.percorre());
                                break;
                            case 3:/*Percorre*/
                                System.out.println("Vetor: " + circular.percorre());
                                JOptionPane.showMessageDialog(null, "Vetor: " + circular.percorre());
                                break;
                            case 0:
                                break;
                            default:/*Tratamento de Erro*/
                                System.out.println("Por favor, escolha as Opções do Menu!");
                                JOptionPane.showMessageDialog(null, "Por favor, escolha as Opções do Menu!");
                                break;
                        }
                    } while (opt != 0);
                    break;
                 
                case 4:// INVERTE STRING
                    qtPosicoes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de letras: \n\n"));
                    InverteString palavra = new InverteString(qtPosicoes);
                    s = JOptionPane.showInputDialog("Digite a palavra:");
                    palavra.adiciona(s);
                    JOptionPane.showMessageDialog(null, "Palavra digitada no vetor:\n" + palavra.percorre() + qtPosicoes);
                    palavra.inverte();
                    JOptionPane.showMessageDialog(null, "Palavra invertida no vetor:\n" + palavra.percorre() + qtPosicoes);
                    break;
                case 0:
                    break;
                default://Tratamento de Erro
                    JOptionPane.showMessageDialog(null, "Por favor, escolha as Opções do Menu!");
                    break;
            }
        } while (opt != 0);
    }
}