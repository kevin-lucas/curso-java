/*
 * Curso Java XTI
 * Aula 047
 * Herança
 */
package br.com.xti.aula047.heranca;

/**
 *
 * @author Kevin Lucas
 */
public class AnimalTest {
    public static void main(String[] args) {
        Cachorro toto = new Cachorro();
        toto.comida = "Ração";
        toto.peso = 5.0;
        toto.dormir();
        System.out.println(toto instanceof Animal);
        
        Galinha carijo = new Galinha();
        carijo.comida = "Milho";
        carijo.peso = 2.0;
        carijo.fazerBarulho();
    }
}
