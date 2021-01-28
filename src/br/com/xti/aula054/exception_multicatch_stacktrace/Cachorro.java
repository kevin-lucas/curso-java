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
public class Cachorro extends Animal {

    double peso;

    // Utiliza o construtor da classe Animal e passa as informações do Cachorro
    public Cachorro() {
        // Referencia ao construtor da classe pai
        super(30, "Carne");

        // Referencia ao atributo peso dessa classe
        // this.peso;
        // Referencia ao atributo peso da classe Animal
        //super.peso;
    }

}
