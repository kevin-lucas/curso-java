/*
 * Curso Java XTI
 * Aula 046
 * Enums Constantes
 */
package br.com.xti.aula046.enuns_constantes_java;

/**
 *
 * @author Kevin Lucas
 */
public class EnumTest {

    // Metodo de exemplo de uso de Enum
    public static void andar(Medida medida, int distancia) {
        System.out.println("Você andou " + distancia + " " + medida.titulo);
    }

    public static void main(String[] args) {
        // Exibe a Enum
        System.out.println(PecasXadrez.BISPO);
        System.out.println(PecasXadrez.CAVALO);

        // Exemplo de Enums Medida
        for (Medida medida : Medida.values()) {
            System.out.println(medida + ":" + medida.titulo);
        }
        
        // Executa o metodo andar
        andar(Medida.MM, 12);
    }
}
