/*
 * Curso Java XTI
 * Aula 35
 * Pacotes 
 */
package br.com.xti.aula035.pacotes_package;

// Importando a classe Cachorro do pacote aula034
import br.com.xti.aula034.orientacao_objetos.Cachorro;

/**
 *
 * @author Kevin Lucas
 */
public class CachorroTestExterno extends Cachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
    }
}
