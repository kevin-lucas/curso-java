/*
 * Curso Java XTI
 * Aula 34
 * Orientação a Objetos
 */
package br.com.xti.aula034.orientacao_objetos;

/**
 *
 * @author Kevin Lucas
 */
public class CachorroTest {

    public static void main(String[] args) {
        // Cria uma instancia de Cachorro
        Cachorro cachorro = new Cachorro();

        // Acessando os atributos do cachorro
        cachorro.raca = "Pit bull";
        cachorro.tamanho = 1;

        // Acessando os metodos do cachorro
        cachorro.latir();

        // Exibindo propiedades
        System.out.println(cachorro.raca);
        System.out.println(cachorro.tamanho);

        // Outro exemplo
        Cachorro cachorro1 = new Cachorro();
        cachorro1.raca = "Lavrador";
        cachorro1.tamanho = 2;
        cachorro1.latir();
    }
}
