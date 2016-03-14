package Intro;

/*
 * 15/02/2016 Revisão Aritmética
 *
 * @author 142016-1-Fernando Moraes Oliveira
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Aritmetica {
   

    public static void main(String args[]) {

       
    }
    
    public void menu(){
         int opt;

        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma Opção:\n\n"
                    + "1 - Soma\n"
                    + "2 - Multiplicação\n"
                    + "3 - Retângulo\n"
                    + "4 - Circunferência\n"
                    + "5 - Azulejos\n"
                    + "6 - Cilindro\n"
                    + "0 - FIM\n\n"));
            switch (opt) {
                case 1:
                    soma();
                    break;
                case 2:
                    multiplicacao();
                    break;
                case 3:
                    retangulo();
                    break;
                case 4:
                    circuferencia();
                    break;
                case 5:
                    azulejos();
                    break;
                case 6:
                    cilindro();
                    break;
                case 0:
                    break;
                default://Tratamento de Erro
                    JOptionPane.showMessageDialog(null, "Por favor, escolha as Opções do Menu!");
                    break;
            }
        } while (opt != 0);
    }

    public static void soma() {
        int n1, n2, resultado;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("SOMA\n\nDigite o 1° número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("SOMA\n\nDigite o 2° número"));
        resultado = n1 + n2;
        JOptionPane.showMessageDialog(null, "SOMA\n\nResultado: " + resultado);
    }

    public static void multiplicacao() {
        int n1, n2, resultado;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("MULTIPLICAÇÃO\n\nDigite o 1° número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("MULTIPLICAÇÃO\n\nDigite o 2° número"));
        resultado = n1 * n2;
        JOptionPane.showMessageDialog(null, "MULTIPLICAÇÃO\n\nResultado: " + resultado);
    }

    public static void retangulo() {
        int n1, n2, area, perimetro;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("RETÂNGULO\n\nDigite a largura"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("RETÂNGULO\n\nDigite a altura"));
        area = n1 * n2;
        perimetro = (n1 * 2) + (n2 * 2);
        JOptionPane.showMessageDialog(null, "RETÂNGULO\n\nÁrea:\n" + area + "\n\nPerímetro:\n" + perimetro);
    }
    
    public static void circuferencia(){
        double raio;

        raio = Integer.parseInt(JOptionPane.showInputDialog("CIRCUFERÊNCIA\n\nDigite o raio"));
        DecimalFormat df = new DecimalFormat("#.##");
        String msg1 = df.format(Math.PI * raio * raio);
        String msg2 = df.format(2 * Math.PI * raio);
        JOptionPane.showMessageDialog(null, "CIRCUFERÊNCIA\n\nÁrea:  " + msg1 + "\nPerímetro:  " + msg2);
    }
    
    public static void azulejos(){
        int n1, n2, parede, azulejo;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("PAREDE\n\nLargura"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("PAREDE\n\nAltura"));
        parede = n1 * n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("AZULEJO\n\nLargura"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("AZULEJO\n\nAltura"));
        azulejo = n1 * n2;

        JOptionPane.showMessageDialog(null, "AZULEJOS\n\nÁrea da Parede:  " + parede 
                + "\nÁrea do Azulejo:  " + azulejo+ "\n\nQuantidade de Azulejos:  " + parede / azulejo);
    }
    
    public static void cilindro(){
        double raio;
        int altura;

        raio = Integer.parseInt(JOptionPane.showInputDialog("CILINDRO\n\nDigite o raio"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("CILINDRO\n\nDigite a altura"));
        DecimalFormat df = new DecimalFormat("#.##");
        String msg = df.format(altura * Math.PI * raio * raio);
        JOptionPane.showMessageDialog(null, "CILINDRO\n\nVolume: " + msg  );
    }
    
}
