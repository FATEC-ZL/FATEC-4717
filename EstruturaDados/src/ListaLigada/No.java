/**
 * Classe exemplo de Lista Ligada.
 *
 * @author Andréa Zotovici (modificado por Fernando M. Oliveira (RA 114016-1)
 * @version 14/03/2016
 */

package ListaLigada;

public class No {
    public int dado;
    public No prox;
    /**
     * Construtor
     * @param e é o elemento do Nó
     */
    public No (int e){
        dado = e;
        prox = null;
    }
}
