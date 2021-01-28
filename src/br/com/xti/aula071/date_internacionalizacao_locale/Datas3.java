/*
 * Curso Java XTI
 * Aula 071
 * Date, Internacionalizacao, Locale
 */
package br.com.xti.aula071.date_internacionalizacao_locale;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Kevin Lucas
 */
public class Datas3 {

    public static void main(String[] args) {
        /* Internacionalização de Datas */

        // Criação de uma data
        Calendar dataUtil = Calendar.getInstance();
        dataUtil.set(2001, Calendar.MAY, 12);

        // Armazena a data em uma variável tipo Date
        Date data = dataUtil.getTime();
        
        /* Localização */
        // Localização do Brasil
        Locale brasil = new Locale("pt", "BR");
        // Localização da Índia
        Locale india = new Locale("hi", "IN");
        // Localização da Estados Unidos
        Locale usa = Locale.US;
        // Localização da Estados Unidos
        Locale alemanha = Locale.GERMANY;
        // Localização da Estados Unidos
        Locale japao = Locale.JAPAN;
        
        /* Formatando a data com a localização */
        DateFormat dataFormatadaLocPadrao = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat dataFormatadaLocBrasil = DateFormat.getDateInstance(DateFormat.FULL, brasil);
        DateFormat dataFormatadaLocUSA = DateFormat.getDateInstance(DateFormat.FULL, usa);
        DateFormat dataFormatadaLocJapao = DateFormat.getDateInstance(DateFormat.FULL, japao);
        DateFormat dataFormatadaLocAlemanha = DateFormat.getDateInstance(DateFormat.FULL, alemanha);
        DateFormat dataFormatadaLocIndia = DateFormat.getDateInstance(DateFormat.FULL, india);
        
        // Exibindo as datas 
        System.out.println("dataFormatadaLocPadrao.format(data) = " + dataFormatadaLocPadrao.format(data));
        System.out.println("dataFormatadaLocBrasil.format(data) = " + dataFormatadaLocBrasil.format(data));
        System.out.println("dataFormatadaLocUSA.format(data) = " + dataFormatadaLocUSA.format(data));
        System.out.println("dataFormatadaLocAlemanha.format(data) = " + dataFormatadaLocAlemanha.format(data));
        System.out.println("dataFormatadaLocJapao.format(data) = " + dataFormatadaLocJapao.format(data));
        System.out.println("dataFormatadaLocIndia.format(data) = " + dataFormatadaLocIndia.format(data));
      
    }
}
