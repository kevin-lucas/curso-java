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
public class InterfaceTest {

    public static void area(AreaCalculavel areaCalculavel) {
        System.out.println(areaCalculavel.calcularArea());
    }

    public static void volume(VolumeCalculavel volumeCalculavel) {
        System.out.println(volumeCalculavel.calcularVolume());
    }

    public static void main(String[] args) {
        area(new Quadrado(2));        
        area(new Cubo(5));
        
        volume(new Cubo(2));
        
        // Mesmos tipos
        Quadrado quadrado = new Quadrado(2);
        AreaCalculavel areaCalculavel = quadrado;
    }
}
