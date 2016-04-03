/**
 * Classe que controla as operações em uma fila circular com objetos.
 *
 * @author Andréa Zotovici (modificado por Fernando M. Oliveira (RA 114016-1)
 * @version 14/03/2016
 */

package Listas;

public class Produto {
    private int codigo;
    private String descricao;
    private double precoCusto;
    private int quantidade;
    private int lote;
    private String validade;

    public Produto(int codigo, String descricao, double precoCusto, int quantidade, int lote, String validade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.quantidade = quantidade;
        this.lote = lote;
        this.validade = validade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCodigo(int ra) {
        this.codigo = ra;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        return "Código: " + codigo 
                + "\nDescrição: " + descricao 
                + "\nPreço de Custo: " + precoCusto 
                + "\nQuantidade: " + quantidade
                + "\nLote: " + lote
                + "\nValidade: " + validade;
    }
}
