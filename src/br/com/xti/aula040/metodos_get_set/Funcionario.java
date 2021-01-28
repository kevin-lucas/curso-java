/*
 * Curso Java XTI
 * Aula 040
 * Metodos Gettes e Settes
 */
package br.com.xti.aula040.metodos_get_set;

/**
 *
 * @author Kevin Lucas
 */
public class Funcionario {

    private String nome;
    boolean ativo;

    //Metodos getters são utlizados para recuperar os dados 
    public String getNome() {
        return nome;
    }

    public boolean getAtivo() {
        return ativo;
    }

    // Os metodos setters são utilizados para informar dados
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
