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
public enum Medida {

    // Inciando valores com o contrutor
    MM("Milimetro"), CM("Centimetro"), M("Metros");

    // Variavel que representa o titulo da Enum
    public String titulo;

    // Construtor da Enum
    Medida(String titulo) {
        this.titulo = titulo;
    }

}
