/**
 * Curso Java XTI
 * Aula 18
 * Operadores Especiais
 */
package br.com.xti.aula018.operadores_especiais;

import java.util.Scanner;

/**
 *
 * @author Kevin Lucas
 *
 */
public class OperadoresEspeciais {

    public static void main(String[] args) {
        int idade = 18;

        // Operador ternário
        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado);

        // Calculo do Diametro
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o raio: ");
        double raio = s.nextDouble();
        double diametro = 2 * raio;
        System.out.println("Diametro: " + diametro);

        // Calculo da Circunferencia = 2 * PI * raio
        final double PI = Math.PI;
        double circunferencia = 2 * PI * raio;
        System.out.println("Circunferencia: " + circunferencia);

        // Calculo da Area = 2 * PI * raio
        double area = PI * (raio * raio);
        System.out.println("Area: " + area);
    }
}
