/**
 * Classe exemplo de Lista Ligada.
 *
 * @author Andréa Zotovici (modificado por Fernando M. Oliveira (RA 114016-1)
 * @version 14/03/2016
 */

package ListaLigada;

public class TesteListaLigada {
    
    public static void main(String arg[]){
        
        ListaLigada l = new ListaLigada();
        l.adicionaInicio (10);
        l.adicionaInicio (20);
        l.adiciona(30, 2);
        l.percorre();
//        l.removeInicio();
//        l.percorre();
//        l.removeFinal();
//        l.percorre();
        
    }
}