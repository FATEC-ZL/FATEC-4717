/*
 * 22/02/2016 Exercício Lista
 *
 * @author 142016-1-Fernando Moraes Oliveira
 */
package Listas;

import javax.swing.JOptionPane;

public class Submenu02 {

    public static void main(String args[]) {

        int opt;
        int qtPosicoes;
        int n;
        String s;

        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma Opção:\n\n"
                    + "01 - Lista\n"
                    + "02 - Lista Aluno\n"
                    + "03 - Lista Produto\n"
                    + "04 - Passagem de Parâmetro\n"
                    + "00 - FIM\n\n"));
            switch (opt) {
                case 1: //Lista
                    Lista l1 = new Lista(4);

                    do {
                        opt = Integer.parseInt(JOptionPane.showInputDialog(
                                "Escolha uma Opção:\n\n"
                                + "01 - Adiciona Início\n"
                                + "02 - Adiciona Final\n"
                                + "03 - Remove Início\n"
                                + "04 - Remove Final\n"
                                + "05 - Remove Posição\n"
                                + "06 - Percorre\n"
                                + "00 - FIM\n\n"));
                        switch (opt) {
                            case 1:
                                n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
                                l1.adicionaInicio(n);
                                l1.percorre();
                                break;
                            case 2:
                                n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
                                l1.adicionaFinal(n);
                                l1.percorre();
                                break;
                            case 3:
                                l1.removeInicio();
                                l1.percorre();
                                break;
                            case 4:
                                l1.removeFinal();
                                l1.percorre();
                                break;
                            case 5:
                                n = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição:"));
                                l1.remove(n);
                                l1.percorre();
                                break;
                            case 6:
                                l1.percorre();
                                break;
                            case 0:
                                break;
                            default://Tratamento de Erro
                                JOptionPane.showMessageDialog(null, "Por favor, escolha as Opções do Menu!");
                                break;
                        }
                    } while (opt != 0);

                case 2: //LISTA DE ALUNOS
                    qtPosicoes = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos itens a Lista comportará: \n\n"));
                    ListaDeAlunos alunos = new ListaDeAlunos(qtPosicoes);

                    do {
                        opt = Integer.parseInt(JOptionPane.showInputDialog(
                                "LISTA DE ALUNOS:\n\n"
                                + "01 - Adiciona Início\n"
                                + "02 - Adiciona Final\n"
                                + "03 - Remove Início\n"
                                + "04 - Remove Final\n"
                                + "05 - Percorre\n\n"
                                + "00 - FIM\n\n"));
                        switch (opt) {
                            case 1:/*Adiciona Início*/

                                n = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA:"));
                                s = JOptionPane.showInputDialog("Digite o nome:");
                                Aluno aini = new Aluno(n, s);
                                alunos.adicionaInicio(aini);
                                JOptionPane.showMessageDialog(null, "Vetor: \n" + alunos.percorre());
                                break;
                            case 2:/*Adiciona Final*/

                                n = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA:"));
                                s = JOptionPane.showInputDialog("Digite o nome:");
                                Aluno afim = new Aluno(n, s);
                                alunos.adicionaFinal(afim);
                                JOptionPane.showMessageDialog(null, "Vetor: \n" + alunos.percorre());
                                break;
                            case 3:/*Remove Inicio*/

                                JOptionPane.showMessageDialog(null, "\nDevolve: \n" + alunos.removeInicio() + "\nVetor: \n"
                                        + alunos.percorre());
                                break;
                            case 4:/*Remove Final*/

                                JOptionPane.showMessageDialog(null, "\nDevolve: \n" + alunos.removeFinal() + "\nVetor: \n"
                                        + alunos.percorre());
                                break;
                            case 5:/*Percorre*/

                                JOptionPane.showMessageDialog(null, "Vetor: \n" + alunos.percorre());
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

                case 3: //LISTA DE PRODUTOS
                    qtPosicoes = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos itens a Lista comportará: \n\n"));
                    ListaDeProdutos produtos = new ListaDeProdutos(qtPosicoes);
                    double vlr;
                    int qtd;
                    int lote;
                    String val;
                    do {
                        opt = Integer.parseInt(JOptionPane.showInputDialog(
                                "LISTA DE PRODUTOS:\n\n"
                                + "01 - Adiciona Início\n"
                                + "02 - Adiciona Final\n"
                                + "03 - Remove Início\n"
                                + "04 - Remove Final\n"
                                + "05 - Percorre\n\n"
                                + "00 - FIM\n\n"));
                        switch (opt) {
                            case 1:/*Adiciona Início*/

                                n = Integer.parseInt(JOptionPane.showInputDialog("Código:"));
                                s = JOptionPane.showInputDialog("Descrição:");
                                vlr = Double.parseDouble(JOptionPane.showInputDialog("Preço de Custo:"));
                                qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade:"));
                                lote = Integer.parseInt(JOptionPane.showInputDialog("Lote:"));
                                val = JOptionPane.showInputDialog("Validade:");

                                Produto pini = new Produto(n, s, vlr, qtd, lote, val);
                                produtos.adicionaInicio(pini);
                                JOptionPane.showMessageDialog(null, "Vetor:\n\n" + produtos.percorre());
                                break;
                            case 2:/*Adiciona Final*/

                                n = Integer.parseInt(JOptionPane.showInputDialog("Código:"));
                                s = JOptionPane.showInputDialog("Descrição");
                                vlr = Double.parseDouble(JOptionPane.showInputDialog("Preço de Custo:"));
                                qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade:"));
                                lote = Integer.parseInt(JOptionPane.showInputDialog("Lote:"));
                                val = JOptionPane.showInputDialog("Validade:");
                                Produto pfim = new Produto(n, s, vlr, qtd, lote, val);
                                produtos.adicionaFinal(pfim);
                                JOptionPane.showMessageDialog(null, "Vetor:\n\n" + produtos.percorre());
                                break;
                            case 3:/*Remove Inicio*/

                                JOptionPane.showMessageDialog(null, "\nDevolve:\n\n" + produtos.removeInicio()
                                        + "\nVetor:\n\n" + produtos.percorre());
                                break;
                            case 4:/*Remove Final*/

                                JOptionPane.showMessageDialog(null, "\nDevolve:\n\n" + produtos.removeFinal()
                                        + "\nVetor:\n\n" + produtos.percorre());
                                break;
                            case 5:/*Percorre*/

                                JOptionPane.showMessageDialog(null, "Vetor:\n\n" + produtos.percorre());
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

                case 4://PASSAGEM DE PARAMETRO
                    Teste.main(args);
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
