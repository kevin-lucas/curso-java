/*
 * Curso Java XTI
 * Aula 054
 * Exeções Exception, Multicatch, StackTrace
 */
package br.com.xti.aula054.exception_multicatch_stacktrace;

/**
 *
 * @author Kevin Lucas
 */
public class Galinha extends Animal {

    public Galinha() {
        super(2, "Milho");
    }

    @Override
    void fazerBarulho() {
        System.out.println("Có, Có!");
    }

}
