/*
 * Curso Java XTI
 * Aula 37
 * Metodos com retorno
 */
package br.com.xti.aula037.metodos_retorno;

/**
 *
 * @author Kevin Lucas
 */
public class Matematica {
    
    // Realiza a soma entre dois numero e retorna o resultado
    double somar(double numero1, double numero2){
        return numero1 + numero2;
    }
    
    // Realiza a divisão entre dois numero e retorna o resultado
    double divide(double numero1, double numero2){
        return numero1 / numero2;
    }
    
    // Verifica quais dois numeros é o maior e retorna o maior numero
    int maiorNumero(int numero1, int numero2){
        if (numero1 > numero2){
            return numero1;
        } else {
            return numero2;
        }
    }
    
}
