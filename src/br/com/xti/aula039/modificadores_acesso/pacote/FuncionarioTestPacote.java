/*
 * Curso Java XTI
 * Aula 39
 * Modificadores de Acesso
 */
package br.com.xti.aula039.modificadores_acesso.pacote;

import br.com.xti.aula039.modificadores_acesso.Funcionario;

/**
 *
 * @author Kevin Lucas
 */
public class FuncionarioTestPacote {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        //funcionario.nome; // não é possivel acessar
        //funcionario.sobreNome = "Fulano"; // não acessivel
        funcionario.idade = 20;
    }
}
