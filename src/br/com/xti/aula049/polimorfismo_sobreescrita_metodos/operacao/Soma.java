/*
 * Curso Java XTI
 * Aula 049
 * Polimorfismo Sobreescrita de metodos
 */
package br.com.xti.aula049.polimorfismo_sobreescrita_metodos.operacao;

/**
 *
 * @author Kevin Lucas
 */
public class Soma extends OperacaoMatematica {

    @Override
    public double calcular(double x, double y) {
        return x + y;
    }
}
