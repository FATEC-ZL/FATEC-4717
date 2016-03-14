package Intro;

/*
 * 15/02/2016 Revisão Vetores
 *
 * @author 142016-1-Fernando Moraes Oliveira
 */
import javax.swing.JOptionPane;

public class Vetores {

    public static void main(String args[]) {

    }

    public void menu() {
        int opt;

        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma Opção:\n\n"
                    + "01 - Exercício N.° 02\n"
                    + "02 - Exercício N.° 03\n"
                    + "03 - Exercício N.° 04\n"
                    + "04 - Exercício N.° 05\n"
                    + "05 - Exercício N.° 06\n"
                    + "06 - Exercício N.° 07\n"
                    + "07 - Exercício N.° 08\n"
                    + "08 - Exercício N.° 09\n"
                    + "09 - Exercício N.° 10\n"
                    + "00 - FIM\n\n"));
            switch (opt) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 0:
                    break;
                default://Tratamento de Erro
                    JOptionPane.showMessageDialog(null, "Por favor, escolha as Opções do Menu!");
                    break;
            }
        } while (opt != 0);
    }

    public static void numZero() {
//4) Implemente uma aplicação Java que recebe um número real e informe se é igual a zero, número positivo ou negativo.
        int n1, n2, resultado;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("SOMA\n\nDigite o 1° número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("SOMA\n\nDigite o 2° número"));
        resultado = n1 + n2;
        JOptionPane.showMessageDialog(null, "SOMA\n\nResultado: " + resultado);
    }

}
