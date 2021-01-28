/*
 * Curso Java XTI
 * Aula 26
 * Fluxo For
 */
package br.com.xti.aula026.fluxo_for;

/**
 *
 * @author Kevin Lucas
 */
public class FluxoFor {

    public static void main(String[] args) {

        /* Executa a instrução ate que a condição implementada seja atendida */
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        System.out.println("-------------------------------");

        // Encontra os número pares de 0 a 20
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("-------------------------------");

        // Executa a instrucao ate que a i seja iqual a 0
        String texto = "";
        for (int i = 10; i > 0; i--) {
            texto += i + ",";
        }
        System.out.println(texto);

        System.out.println("-------------------------------");

        texto = "";
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                texto += i + ",";
            }
        }
        System.out.println(texto);

        System.out.println("-------------------------------");

        // For aninhado
        int tamanho = 5;
        for (int i = 0; i < tamanho; i++) {
            for (int x = 0; x < tamanho; x++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
