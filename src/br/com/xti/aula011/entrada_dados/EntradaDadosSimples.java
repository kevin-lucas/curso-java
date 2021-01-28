/**
 * Curso de Java XTI
 * Aula 010
 * Entrada de Dados
 */
package br.com.xti.aula011.entrada_dados;

// Importando a classe Scanner
import java.util.Scanner;

/**
 *
 * @author Kevin Lucas
 *
 */
public class EntradaDadosSimples {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Entrada de dados utlizando o metódo principal main com o array args
        // System.out.println(args[0]);

        // Utilizando a class Scanner para capturar os dados informados pelo usuário
        Scanner s = new Scanner(System.in); // Utiliza a entrada do sistema para capturar a informação
        System.out.print("Informe seu nome: ");
        System.out.print(s.nextLine());
        s.close();
    }

}
