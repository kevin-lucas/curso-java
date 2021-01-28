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
public class Animal {

    protected int serial;

    double peso;
    String comida;

    public Animal() {
        this(0, "Ração");
    }

    public Animal(double peso, String comida) {
        this.peso = peso;
        this.comida = comida;
    }
    
    void dormir(){
        System.out.println("Dormiu");
    }
    
    void fazerBarulho(){
        System.out.println("Faz barulho!");
    }
}
