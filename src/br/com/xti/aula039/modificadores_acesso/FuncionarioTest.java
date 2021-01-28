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
public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        //funcionario.nome; // não é possivel acessar
       funcionario.sobreNome = "Fulano"; 
       funcionario.idade = 20;
    }
}
