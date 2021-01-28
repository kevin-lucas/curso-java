/*
 * Curso Java XTI
 * Aula 39
 * Modificadores de Acesso
 */
package br.com.xti.aula039.modificadores_acesso;

/**
 *
 * @author Kevin Lucas
 */
public class Funcionario {
    
    //Atributos do Funcionario
    // Este atributo será acessivel apenas dentro da classe Funcionario
    private String nome;
    
    // Este atributo será acessivel somente dentro do pacote em que a classe Funcionario está.
    protected String sobreNome;
    
    // Este atributo será acessivel em todas as classes e pacotes
    public int idade;
}
