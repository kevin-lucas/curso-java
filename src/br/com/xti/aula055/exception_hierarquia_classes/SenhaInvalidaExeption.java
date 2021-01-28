/*
 * Curso Java XTI
 * Aula 055
 * Execption Hierarquia de Classes
 */
package br.com.xti.aula055.exception_hierarquia_classes;

/**
 *
 * @author Kevin Lucas
 */
public class SenhaInvalidaExeption extends Exception {

    // Cria uma execao que herda de exception
    public SenhaInvalidaExeption(String mensagem) {
        super(mensagem);
    }
}
