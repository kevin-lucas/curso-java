/*
 * Curso Java XTI
 * Aula 31
 * AutoBoxing
 */
package br.com.xti.aula031.autoboxing;

/**
 *
 * @author Kevin Lucas
 */
public class AutoBoxing {
    public static void main(String[] args) {
        /* 1º a 5° versão do JDK */
        // Criando um envolucro
        Integer numero = new Integer(555);
        
        // Recuperando o valor inteiro
        int num = numero.intValue();
        num++;
        
        // Reempacotando a variável
        numero = new Integer(num);
        
        // Apartir da 6° versão do JDK
        Integer inteiro = 555;
        inteiro++;
        System.out.println(inteiro);
        System.out.println(inteiro.intValue());

        // Exemplos
        Boolean boleano = new Boolean("true");
        if (boleano) {
            System.out.println(boleano);
        }
    }
}
