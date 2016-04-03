/*
 * 15/02/2016 Revisão Aritmética
 * @author 142016-1-Fernando Moraes Oliveira
 */
package ListaLigada;

import javax.swing.JOptionPane;

public class Submenu04 {

    public static void main(String args[]) {

        ListaLigada ll1 = new ListaLigada();

        int opt;
        int n;
        int p;

        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma Opção:\n\n"
                    + "01 - Adiciona Início\n"
                    + "02 - Adiciona Final\n"
                    + "03 - Adiciona por Posição\n"
                    + "04 - Remove Início\n"
                    + "05 - Remove Final\n"
                    + "06 - Remove por Posição\n"
                    + "07 - Percorre\n"
                    + "00 - FIM\n\n"));
            switch (opt) {
                case 1: //ADICIONA INICIO
                    n = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número Inteiro: "));
                    ll1.adicionaInicio(n);
                    ll1.percorre();
                    break;
                case 2: //ADICIONA FINAL
                    n = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número Inteiro: "));
                    ll1.adicionaFinal(n);
                    ll1.percorre();
                    break;
                case 3://ADICIONA POSIÇÃO
                    n = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número Inteiro: "));
                    p = Integer.parseInt(JOptionPane.showInputDialog("Digite uma Posição: "));
                    ll1.adiciona2(n, p);
                    ll1.percorre();
                    break;
                case 4: //REMOVE INICIO
                    ll1.removeInicio();
                    ll1.percorre();
                    break;
                case 5: //REMOVE FINAL
                    ll1.removeFinal();
                    ll1.percorre();
                    break;
                case 6: //REMOVE POSIÇÃO
                    p = Integer.parseInt(JOptionPane.showInputDialog("Digite uma Posição: "));
                    ll1.remove(p);
                    ll1.percorre();
                    break;
                case 7: //PERCORRE
                    ll1.percorre();
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
