package Intro;

/*
 * 15/02/2016 Revisão Estruturas de Condição
 *
 * @author 142016-1-Fernando Moraes Oliveira
 */

import javax.swing.JOptionPane;

public class Condicional {

    public static void main(String args[]) {

    }

    public void menu() {
        int opt;

        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma Opção:\n\n"
                    + "01 - Exercício N.° 04\n"
                    + "02 - Exercício N.° 05\n"
                    + "03 - Exercício N.° 06\n"
                    + "04 - Exercício N.° 07\n"
                    + "05 - Exercício N.° 08\n"
                    + "06 - Exercício N.° 09\n"
                    + "07 - Exercício N.° 10\n"
                    + "08 - Exercício N.° 11\n"
                    + "09 - Exercício N.° 12\n"
                    + "10 - Exercício N.° 13\n"
                    + "00 - FIM\n\n"));
            switch (opt) {
                case 1:
                    numZero();
                    break;
                case 2:
                    numParImpar();
                    break;
                case 3:
                    numIguais();
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

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
        float n;
        boolean r;

        n = Integer.parseInt(JOptionPane.showInputDialog("N° Zero, Positivo ou Negativo\n\nDigite um número real"));
       
        if((n % 2) == 0){
            r = true;
        } else {
            r = false;
        }
        
        JOptionPane.showMessageDialog(null, "N° Zero, Positivo ou Negativo\n\nResultado: " + r);
    }

    public static void numParImpar() {
//5) Implemente uma aplicação Java que recebe um número inteiro e informe se é par ou ímpar.

    }

    public static void numIguais() {
//Implemente uma aplicação Java que recebe dois números reais e informa se são iguais. Caso sejam diferentes, informe o maior e o menor.

    }
}