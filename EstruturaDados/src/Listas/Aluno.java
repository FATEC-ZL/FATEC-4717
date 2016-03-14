/**
 * Classe que controla as operações em uma fila circular com objetos.
 * @author Andréa Zotovici (modificado por Fernando Moraes Oliveira (RA 114016-1)
 * @version 07/03/2016
 */

package Listas;

public class Aluno {
    private int ra;
    private String nome;

    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ra=" + ra + ", nome=" + nome + '\n';
    }
}