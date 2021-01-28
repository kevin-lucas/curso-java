/*
 * Curso Java XTI
 * Aula 070
 * Date, Formatação, Dateformat, format, parse
 */
package br.com.xti.aula070.date_formatacao_dateformat_format_parse;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Kevin Lucas
 */
public class Datas2 {

    public static void main(String[] args) throws ParseException {
        Calendar dataUtil = Calendar.getInstance();
        dataUtil.set(1998, Calendar.APRIL, 15);
        Date data = dataUtil.getTime();
        // Exibe formatacao padrao da data
        System.out.println("dataUtil.getTime() = " + data);

        /* Formatação de datas */
        // Formatação somente de datas
        DateFormat dataFormatada = DateFormat.getDateInstance();
        // Data formatada com DateFormat padrao no formato pt-br
        System.out.println("dataFormatada.format(data) = " + dataFormatada.format(data));

        // Formatação somente das horas
        DateFormat horaFormatada = DateFormat.getTimeInstance();
        // Hora formatada com DateFormat padrao no formato pt-br
        System.out.println("horaFormatada.format(data) = " + horaFormatada.format(data));

        // Formatação da hora e data
        DateFormat dataHoraFormatada = DateFormat.getDateTimeInstance();
        // Data e hora formatada com DateFormat padrao no formato pt-br
        System.out.println("dataHoraFormatada.format(data) = " + dataHoraFormatada.format(data));

        /* Estilos de formatação */
        // Exibe a data no seu formato completo
        DateFormat estiloFormatacao = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("getDateInstance(DateFormat.FULL) = "
                + estiloFormatacao.format(data));
        // Exibe a data no seu formato longo
        estiloFormatacao = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("getDateInstance(DateFormat.LONG) = "
                + estiloFormatacao.format(data));
        // Exibe a data no seu formato medio
        estiloFormatacao = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("getDateInstance(DateFormat.MEDIUM) = "
                + estiloFormatacao.format(data));
        // Exibe a data no seu formato curto
        estiloFormatacao = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("getDateInstance(DateFormat.SHORT) = "
                + estiloFormatacao.format(data));

        /* Conversão de String em Date */
        // Converte a string passada como parametro e lanca uma execao ParseException
        Date dataConvertida = estiloFormatacao.parse("12/10/2001");
        System.out.println(dataConvertida);

        /* Formatação de Datas Simples */
        SimpleDateFormat estiloFormatacaoSimples = new SimpleDateFormat("dd/MM/yyyy");
        // Exibe a data no estilo de formatacao media
        System.out.println(estiloFormatacaoSimples.format(data));
        // Converte Objetos
        System.out.println(estiloFormatacaoSimples.parseObject("23/03/2005"));
    }
}
