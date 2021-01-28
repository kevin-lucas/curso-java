/*
 * Curso Java XTI
 * Aula 092
 * Tipos Genericos Novo
 */
package br.com.xti.aula092.genericos;

import java.util.ArrayList;

/**
 *
 * @author Kevin Lucas
 */
// Declara que classe pode receber qualquer tipo de elemento
// E significa Elemento
public class GenericoNovo<E> {

    E elemento;

    public E getElemento() {
        return elemento;
    }

    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    // Caractere coringa
    // Permitem especificar parametros que atuam como supertipos ou subtipos parametemizados
    // Metodo soma utiliza com parametro um conjunto de subtipos da classe Number
    // Permite que receba parametros que seja Number ou filhos de Number
    public double soma(ArrayList<? extends Number> lista) {
        return 0;
    }

    public static void main(String[] args) {
        /* Intanciando um elemento generico */
        GenericoNovo<String> elementoGenerico = new GenericoNovo<String>();

        // Elemento como uma literal
        elementoGenerico.setElemento("Texto");
        System.out.println("elementoGenerico.getElemento() = " + elementoGenerico.getElemento());

        // Não permite atribuir um boolean, retorna um erro de compilação.
        // elementoGenerico.setElemento(1234);
        
        // Acessando os metodos 
        System.out.println("elementoGenerico.getElemento().toUpperCase() = " + elementoGenerico.getElemento().toUpperCase());

        // Verifica se o objeto é uma instancia de Object
        System.out.println(elementoGenerico.getElemento() instanceof Object);
    }

}
