/*
 * Curso Java XTI
 * Aula 28
 * Desafio Compras
 */
package br.com.xti.aula028.fluxo_while_dowhile_desafio_compras;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kevin Lucas
 */
public class DesafioCompras {

    public static void main(String[] args) {

        // Cria um lista de produtos
        ArrayList<String> produtos = new ArrayList<String>();

        // Captura os produto digitado pelo usuário
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um produto ou digite fim para encerrar");

        // Verifica se o produto é diferente de fim
        // se for igual a "fim" finaliza a compra e apresenta ao usuário a lista 
        String produto;
        while (!("fim".equals(produto = leitor.next()))) {
            produtos.add(produto);
        }
        System.out.println("Sua lista de produtos: " + produtos.toString());
    }
}
