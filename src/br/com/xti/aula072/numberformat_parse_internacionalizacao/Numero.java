/*
 * Curso Java XTI
 * Aula 072
 * Numberformat, parse, Internacionalizacao
 */
package br.com.xti.aula072.numberformat_parse_internacionalizacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import javax.xml.transform.Source;

/**
 *
 * @author Kevin Lucas
 */
public class Numero {

    public static void main(String[] args) throws ParseException {
        /* Formatação de numeros */

        // Número a ser formatado        
        double numero = 12.55;

        // Formatação padrao
        NumberFormat formatacaoPadrao = NumberFormat.getInstance();
        System.out.println("formatacaoPadrao.format(numero) = " + formatacaoPadrao.format(numero));

        // Formatação de números inteiros
        NumberFormat formatacaoInteiro = NumberFormat.getIntegerInstance();
        System.out.println("formatacaoInteiro.format(numero) = " + formatacaoInteiro.format(numero));

        // Formatação de números percentuais
        NumberFormat formatacaoPercentual = NumberFormat.getPercentInstance();
        System.out.println("formatacaoPercentual.format(0.25) = " + formatacaoPercentual.format(0.25));

        // Formatação de números moeda
        NumberFormat formatacaoMoeda = NumberFormat.getCurrencyInstance();
        System.out.println("formatacaoMoeda.format(numero) = " + formatacaoMoeda.format(numero));

        // Definindo casas decimais
        NumberFormat formatacaoMoedaCasasDecimais = NumberFormat.getCurrencyInstance();
        // Define o maximo de casas decimais 
        formatacaoMoedaCasasDecimais.setMaximumFractionDigits(1);
        System.out.println("formatacaoMoedaCasasDecimais.format(numero) = " + formatacaoMoedaCasasDecimais.format(numero));

        /* Internacionalização de numeros */
        // Moeda americana
        NumberFormat formatacaoMoedaAmericana = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("formatacaoMoedaAmericana.format(numero) = " + formatacaoMoedaAmericana.format(numero));

        // Moeda Franseca
        NumberFormat formatacaoMoedaFrancesa = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("formatacaoMoedaFrancesa.format(numero) = " + formatacaoMoedaFrancesa.format(numero));

        /* Conversão de Valores */
        NumberFormat conversao = NumberFormat.getCurrencyInstance();
        // Converte a string em um Numero e lanca uma execao ParseException
        Number numeroConvertido = conversao.parse("R$ 1.100,25");
        System.out.println("conversao.parse(\"R$ 1.100,25\") = " + numeroConvertido);
    }
}
