/*
 * Curso Java XTI
 * Aula 19
 * Desafio IMC
 */
package br.com.xti.aula019.desafio_calculo_imc;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Lucas
 *
 */
public class DesafioImc {

    public static void main(String[] args) {
        // IMC = peso / (altura * altura)

        // Recupera o valor do peso informado pelo usuário
        String peso = JOptionPane.showInputDialog("Informe seu peso");
        String altura = JOptionPane.showInputDialog("Informe sua altura");

        // Realiza a convesão dos valores
        double pesoKilo = Double.parseDouble(peso);
        float alturaMetros = Float.parseFloat(altura);

        // Realiza o calculo do IMC
        double IMC = pesoKilo / (alturaMetros * alturaMetros);

        // IMC entre 20 e 25 é o peso ideal
        // IMC acima de 25 peso fora do ideal
        String mensagem = (IMC >= 20 && IMC <= 25) ? "Seu IMC é " + IMC + ", parabéns peso ideal."
                : "Seu IMC é " + IMC + ", cuidado peso acima do ideal.";

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
