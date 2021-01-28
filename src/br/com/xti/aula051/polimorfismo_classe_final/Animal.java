/*
 * Curso Java XTI
 * Aula 051
 * Polimorfismo Classes e Metodos Finais
 */
package br.com.xti.aula051.polimorfismo_classe_final;

/**
 *
 * @author Kevin Lucas
 */
public class Animal {

    // Metodos final impede o polimorfismo
    final void fazerBarulho() {
        System.out.println("Fazer barulho");
    }

}
