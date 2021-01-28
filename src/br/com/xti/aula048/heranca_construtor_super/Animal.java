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
public class Animal {

    // Construtor pai
    public Animal() {
        this(0, "Ração");
    }

    public Animal(double peso, String comida) {
        this.peso = peso;
        this.comida = comida;
    }

    double peso;
    String comida;

    void dormir() {
        System.out.println("Dormiu!");
    }

    void fazerBarulho() {
        System.out.println("Fazendo barulho");
    }

}
