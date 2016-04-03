/**
 * Classe exemplo de Passage de Parametro.
 *
 * @author Andréa Zotovici (modificado por Fernando M. Oliveira (RA 114016-1)
 * @version 14/03/2016
 */

package Listas;

public class Teste {
    
    public static void incrementa(int v[]){
        for(int i = 0; i < v.length; i++)
            v[i]++;
    }
    
    public static void incrementa(int v){
        v++;
    }
    
    public static void incrementa(Numero v){
        int n = v.getValor()+1;
        v.setValor(n);
    }
    
    public static void main (String args[]){//TESTE
        int X[] = {5,11,26};
        int Z = 7;
        
        Numero N = new Numero(Z);
        incrementa (X);
        incrementa (Z);
        incrementa (N);
    
        System.out.println("Tipo Primitivo resultou em: " + Z);
        System.out.println("TAD Numero resultou em: " + N.getValor());
        System.out.println("O Vetor resultou em: ");
    }
}