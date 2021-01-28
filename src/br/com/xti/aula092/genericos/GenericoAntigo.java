/*
 * Curso Java XTI
 * Aula 092
 * Tipos Genericos Antigo
 */
package br.com.xti.aula092.genericos;

/**
 *
 * @author Kevin Lucas
 */
public class GenericoAntigo {

    /* Antigamente utilizava-se a classe Object pois trata-se da elemento mais
        generico no java.
     */
    Object elemento;

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Object getElemento() {
        return this.elemento;
    }

    public static void main(String[] args) {

        /* Intanciando um objeto generico */
        GenericoAntigo elementoGenerico = new GenericoAntigo();
        
        // Elemento como uma literal
        elementoGenerico.setElemento("Texto");
        System.out.println("elementoGenerico.getElemento() = " + elementoGenerico.getElemento());

        // Elemento como um inteiro
        elementoGenerico.setElemento(123);
        System.out.println("elementoGenerico.getElemento() = " + elementoGenerico.getElemento());

        // Elemento como boleano
        elementoGenerico.setElemento(true);
        System.out.println("elementoGenerico.getElemento() = " + elementoGenerico.getElemento());

        /* A limitação dessa implementação é que não posibilita que o elemento possa
        os metodos de seus tipos.
        */
        // Convertendo os valores para utilizar os metodos
        Boolean elementoConvertido = (Boolean) elementoGenerico.getElemento();
        // Utilizando os metodos dos envolucros
        System.out.println("elementoConvertido.compareTo(false) = " + elementoConvertido.compareTo(false));
        
        // Verifica se o objeto é uma instancia de Object
        System.out.println(elementoGenerico.getElemento() instanceof Object);
    }

}
