/*
 * Curso Java XTI
 * Aula 044
 * Construtores
 */
package br.com.xti.aula044.construtores;

/**
 *
 * @author Kevin Lucas
 */

public class CarroTest {
    public static void main(String[] args) {
        
        // Utilizando o construtor vazio
        Carro uno = new Carro();
        uno.modelo = "Uno";
        uno.velocidadeMaxima = 120;
        uno.segundosZeroACem = 17.0;
        System.out.println(uno.modelo);
        
        // Utilizando o construtor passando valores
        Carro vostro = new Carro("Voltro", 160, 8.0);
        System.out.println(vostro.modelo);
        
    }
}
