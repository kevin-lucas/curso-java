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

/* implements é utilizado para usar uma inteface */
public class Cubo implements AreaCalculavel, VolumeCalculavel {

    double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularVolume() {
        return 6 * lado * lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado * this.lado;
    }
}
