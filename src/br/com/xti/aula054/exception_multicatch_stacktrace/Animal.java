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
