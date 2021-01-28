/*
 * Curso Java XTI
 * Aula 047
 * Herança
 */
package br.com.xti.aula048.heranca_construtor_super;

/**
 *
 * @author Kevin Lucas
 */
public class AnimalTest {

    public static void main(String[] args) {
        Cachorro toto = new Cachorro();
        System.out.println(toto.comida);

        Galinha carijo = new Galinha();
        System.out.println(carijo.comida);

        // Comparação de tipos 
        System.out.println(carijo instanceof Animal);
        System.out.println(carijo instanceof Galinha);
        System.out.println(toto instanceof Cachorro);

        /* Metodos da classe Object do qual todas as classes herdam */
        System.out.println(toto.equals(carijo));
        System.out.println(toto.hashCode());
        System.out.println(toto.getClass());
        System.out.println(toto.toString());
    }
}
