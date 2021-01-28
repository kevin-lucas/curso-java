/*
 * Curso Java XTI
 * Aula 052
 * Polimorfismo Interfaces
 */
package br.com.xti.aula052.polimorfismo_interfaces;

/**
 *
 * @author Kevin Lucas
 */
public class Quadrado implements AreaCalculavel {

    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (lado * lado);
    }
}
