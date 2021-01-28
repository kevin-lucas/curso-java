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
public class Galinha extends Animal {

    public Galinha() {
        super(2, "Milho");
    }

    @Override
    void fazerBarulho() {
        System.out.println("Có, Có!");
    }

}
