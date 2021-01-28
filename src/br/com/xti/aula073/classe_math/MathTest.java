/*
 * Curso Java XTI
 * Aula 073
 * Classe Math
 */
package br.com.xti.aula073.classe_math;

/**
 *
 * @author Kevin Lucas
 */
public class MathTest {

    public static void main(String[] args) {

        /* Calculos com a Classe Math */
        // Calcula o seno
        System.out.println("Math.sin(90) = " + Math.sin(90));

        // Calcula o cosseno
        System.out.println("Math.cos(90) = " + Math.cos(10.0));

        // Calcula o tangente
        System.out.println("Math.tan(90) = " + Math.tan(10.0));

        // Calcula a potencia
        System.out.println("Math.pow(90, 2) = " + Math.pow(10.0, 2));

        // Calcula a raiz quadrada
        System.out.println("Math.sqrt(90) = " + Math.sqrt(45.0));

        // Calcula a raiz cubica
        System.out.println("Math.cbrt(90) = " + Math.cbrt(45.0));

        // Calcula a hypotenusa
        System.out.println("Math.hypot(90, 2.0) = " + Math.hypot(10.0, 2.0));
    }
}
