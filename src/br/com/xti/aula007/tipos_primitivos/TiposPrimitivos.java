/**
 * Curso Java XTI
 * Aula 007
 * Tipos Primitivos
 *
 */
package br.com.xti.aula007.tipos_primitivos;

/**
 *
 * @author Kevin Lucas
 *
 */
public class TiposPrimitivos {

    public static void main(String[] args) {

        // Exemplos de tipos primitivos
        int idade = 20;
        double preco = 12.45;
        char sexo = 'M';
        boolean casado = false;
        System.out.println(idade);
        System.out.println(preco);
        System.out.println(sexo);
        System.out.println(casado);

        // Tipos primitivos
        // Inteiros
        // Armazena valores de -128 até 127 referentes a 8 bits de tamanho
        byte b = 127;
        System.out.println(b);
        // Armazena valores de -32768 até 32767 referentes a 16 bits de tamanho
        short s = 32767;
        System.out.println(s);
        // Armazena valores de -2.147.483.648 até 2.147.483.647 referentes a 32 bits de tamanho
        int i = 2_147_483_647;
        System.out.println(i);
        // Armazena valores de -9.223.372.036.854.770.000 até -9.223.372.036.854.770.000 referentes a 64 bits de tamanho
        long l = 923000000;
        System.out.println(l);

        // Ponto Flutuante
        // Armazena valores de -4.94E-307 até 1.797693134... referentes a 64 bits de tamanho
        double d = -4.94E-307;
        System.out.println(d);
        // Armazena valores de -4.94E-307 até 1.797693134... referentes a 64 bits de tamanho        
        float f = -1.40F;
        System.out.println(f);

        // Caractere
        // Armazena 0 de 65535 referentes a 16 bits de tamanho  
        char c = 'C';
        System.out.println(c);

        // Booleano
        // Armazena false ou true 1 bit de tamanho  
        boolean bo = true;
        System.out.println(bo);

        // Conversão de Tipos - Casting
        // Conversão é possível devido ao tamanho menor dos tipos
        // Cast implicíto
        i = s;

        // Conversão não é possível devido ao tamanho maior 
        // Cast explícito
        i = (int) l;

        // Valores binários 
        // Utilizando valores binários para armazenar valores.
        byte bb = 0b01010101;
        System.out.println(bb);

        short ss = 0b0101010101010101;
        System.out.println(ss);

        int ii = 0b011111111111111111111111111111111;
        System.out.println(ii);
    }
}
