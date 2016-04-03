/*
 * 15/02/2016 Revisão Aritmética
 * @author 142016-1-Fernando Moraes Oliveira
 */
package Principal;

import javax.swing.JOptionPane;
import Intro.Submenu01;
import Listas.Submenu02;
import PilhasFilas.Submenu03;
import ListaLigada.Submenu04;

public class Menu {

    public static void main(String args[]) {

        int opt;

        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma Opção:\n\n"
                    + "01 - Introdução\n"
                    + "02 - Listas\n"
                    + "03 - Filas e Pilhas\n"
                    + "04 - Lista Ligada\n"
                    + "00 - FIM\n\n"));
            switch (opt) {
                case 1:// INTRO
                    Submenu01.main(args);
                    break;
                case 2:// LISTA
                    Submenu02.main(args);
                    break;
                 case 3:// PILHAS E FILHAS
                    Submenu03.main(args);
                    break;
                 case 4://LISTA LIGADA
                     Submenu04.main(args);
                case 0:
                    break;
                default://Tratamento de Erro
                    JOptionPane.showMessageDialog(null, "Por favor, escolha as Opções do Menu!");
                    break;
            }
        } while (opt != 0);
    }

}