/*
 * Curso Java XTI
 * Aula 049
 * Polimorfismo Sobreescrita de metodos
 */
package br.com.xti.aula050.polimorfismo_classe_abstract;

/**
 *
 * @author Kevin Lucas
 */
public class AnimalTest {

    public static void main(String[] args) {

        // O abstract não permite que a classe seja instanciada
        // Animal generico = new Animal();
        Animal cachorro = new Cachorro();
        Animal galinha = new Galinha();

    }
}
