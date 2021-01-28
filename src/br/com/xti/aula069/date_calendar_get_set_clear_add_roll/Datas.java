/*
 * Curso Java XTI
 * Aula 069 
 * Date, Calendar, Get, Set, Clear, Add, Roll
 */
package br.com.xti.aula069.date_calendar_get_set_clear_add_roll;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Kevin Lucas
 */
public class Datas {

    public static void main(String[] args) {
        /* O tempo é representado em milessegundos com tipo long,
        começando em 1970.
         */

        // Data em Milesegundos
        Date dataEmMilessegundos = new Date(1_000_000_000L);
        System.out.println("dataEmMilessegundos = " + dataEmMilessegundos);

        // Data de hoje em milessegundos
        Date dataHojeMilessegundo = new Date(System.currentTimeMillis());
        System.out.println("dataHojeMilessegundo = " + dataHojeMilessegundo);

        // Ao instanciar uma data a mesma é recupera por padrão a data de hoje
        Date dataHoje = new Date();
        System.out.println("dataHoje = " + dataHoje);

        /* Metodos classe Date */
        // Recupera a data em milessegundos
        System.out.println("dataHoje.getTime() = " + dataHoje.getTime());
        // Altera o valor da data
        dataHoje.setTime(7_000_000_000_000L);
        System.out.println("dataHoje.setTime = " + dataHoje);
        // Compara duas datas
        System.out.println("dataHoje.compareTo(dataEmMilessegundos) = " + dataHoje.compareTo(dataEmMilessegundos));

        /* Manipulação de Datas */
        // Para manupulação de datas utiliza-se a classe Calendar 
        // Cria uma instancia do calendario gregoriano
        //Calendar dataUtil = new GregorianCalendar();
        // Cria uma instancia do calendario padrão
        Calendar dataUtil = Calendar.getInstance();
        // Cria uma data
        dataUtil.set(1980, Calendar.AUGUST, 23);
        // Exibindo a data
        System.out.println(dataUtil.getTime());

        /* Exibindo informacoes da data */
        // Exibe o ano da data
        System.out.println(dataUtil.get(Calendar.YEAR));
        // Exibe o mes da data
        System.out.println(dataUtil.get(Calendar.MONTH));
        // Exibe o dia do mes da data
        System.out.println(dataUtil.get(Calendar.DAY_OF_MONTH));

        /* Alterando informacoes da data */
        // Altera o ano da data 
        dataUtil.set(Calendar.YEAR, 2000);
        // Altera o mes da data 
        dataUtil.set(Calendar.MONTH, Calendar.APRIL);
        // Altera o dia do mes 
        dataUtil.set(Calendar.DAY_OF_MONTH, 15);
        // Exibe a data
        System.out.println(dataUtil.getTime());

        /* Modificando a data */
        // Limpa o campo de horas da data
        dataUtil.clear(Calendar.HOUR);
        // Limpa o campo de minutos da data
        dataUtil.clear(Calendar.MINUTE);
        // Limpa o campo de segundos da data
        dataUtil.clear(Calendar.SECOND);
        System.out.println(dataUtil.getTime());

        // Adiciona unidades do tempo
        dataUtil.add(Calendar.YEAR, 1);
        dataUtil.add(Calendar.MONTH, 1);
        dataUtil.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println(dataUtil.getTime());

        // Remove unidade do tempo
        dataUtil.add(Calendar.YEAR, -4);
        System.out.println(dataUtil.getTime());

        /* Modifica apenas a unidade de tempo que foi passado como parametro */
        // Faz com que a data passe para o proximo mês
        dataUtil.add(Calendar.DAY_OF_MONTH, 21);
        System.out.println(dataUtil.getTime());

        // Não altera a unidade de tempo superior no caso o mes
        dataUtil.roll(Calendar.DAY_OF_MONTH, 21);
        System.out.println(dataUtil.getTime());

        // Exibindo mesagem de saudadacao de acordo com a data
        Calendar hora = Calendar.getInstance();
        int horaAtual = hora.get(Calendar.HOUR_OF_DAY);
        System.out.println(horaAtual);
        if (horaAtual < 12){
            System.out.println("Bom dia");
        } else if (horaAtual < 18){
            System.out.println("Boa Tarde");
        } else {
            System.out.println("Boa Noite");
        }
    }
}
