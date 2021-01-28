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
public class FuncionarioTest {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Fulano");
        System.out.println(funcionario.getNome());
    }
}
