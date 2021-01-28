/*
 * Curso Java XTI
 * Aula 30
 * Label, Breack e Continue
 */
package br.com.xti.aula030.label_break_continue;

/**
 *
 * @author Kevin Lucas
 */
public class FluxoLabelBreackContinue {

    public static void main(String[] args) {

        // breack
        // breack é a palavra chave utlizada para parar um loop
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                // Força a parada do loop
                break;
            }
            System.out.println(i);
        }

        System.out.println("--------------------------");

        // continue
        // continue é utlizado para pular a instrução
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // passa pela instrução sem terminar o loop atual e vai para o proximo loop
            }
            System.out.println(i);
        }

        System.out.println("--------------------------");

        // Label
        boolean[][] matrix = {
            {false, false, false, false, false},
            {false, false, false, false, true}
        };

        busca:
        for (int a = 0; a < matrix.length; a++) {
            System.out.print("A ");
            for (int b = 0; b < matrix[a].length; b++) {
                if (matrix[a][b]) {
                    break busca;
                }
                System.out.print("B ");
            }
        }
    }
}
