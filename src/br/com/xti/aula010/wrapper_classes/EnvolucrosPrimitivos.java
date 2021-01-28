/**
 * Curso de Java XTI
 * Aula 010
 * Envólucros de Tipos Primitivos
 */
package br.com.xti.aula010.wrapper_classes;

/**
 *
 * @author Kevin Lucas
 *
 */
public class EnvolucrosPrimitivos {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Tipos Literais
        // Criando uma variável string
        String texto = "Meu texto";
        System.out.println(texto);

        // Contruindo strings
        String s = new String("Texto");
        System.out.println(s);

        // Utilizando o tipo primitivo char e passando para o envolucro
        char[] c = {'t', 'e', 'x', 't', 'o'};
        String s2 = new String(c);
        System.out.println(s2);

        byte[] b = {0b000001};
        String s3 = new String(b);
        System.out.println(s3);

        // Os envolucros possível metódos para manipular as variáveis primitivas e seus valores
        // Transforma o texto em maíusculo.
        System.out.println(s.toUpperCase());

        // Tipos númericos
        Double d = 10.0;
        double preco = 19.90;
        Double d2 = new Double(preco);
        System.out.println(d2);

        // Tipos booleanos
        Boolean bo = false;
        System.out.println(bo);
    }
}
