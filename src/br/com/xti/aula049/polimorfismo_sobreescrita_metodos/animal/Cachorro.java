/*
 * Curso Java XTI
 * Aula 049
 * Polimorfismo Sobreescrita de metodos
 */
package br.com.xti.aula049.polimorfismo_sobreescrita_metodos.animal;

/**
 *
 * @author Kevin Lucas
 */
public class Cachorro extends Animal {

    double peso;

    public Cachorro() {
        super(30, "Carne");
    }

    @Override
    void fazerBarulho() {
        System.out.println("Au Au!");
    }
    
    
}
