/*
 * 15/02/2016 Revisão Aritmética
 *
 * @author 142016-1-Fernando Moraes Oliveira
 */
package Intro;

import javax.swing.JOptionPane;

public class Submenu01 {

    public static void main(String args[]) {

        Aritmetica aritmetica = new Aritmetica();
        Condicional condicional = new Condicional();
        Repeticao repeticao = new Repeticao();
        Vetores vetores = new Vetores();
        Strings strings = new Strings();

        int opt;

        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma Opção:\n\n"
                    + "01 - Aritmetica\n"
                    + "02 - Condicional\n"
                    + "03 - Repetição\n"
                    + "04 - Vetores\n"
                    + "05 - Strings\n"
                    + "00 - FIM\n\n"));
            switch (opt) {
                case 1:
                    aritmetica.menu();
                    break;
                case 2:
                    condicional.menu();
                    break;
                case 3:
                    repeticao.menu();
                    break;
                case 4:
                    vetores.menu();
                    break;
                case 5:
                    strings.menu();
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