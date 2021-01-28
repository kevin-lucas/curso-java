/*
 * Curso Java XTI
 * Aula 048
 * Herança Construtor super
 */
package br.com.xti.aula048.heranca_construtor_super;

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
