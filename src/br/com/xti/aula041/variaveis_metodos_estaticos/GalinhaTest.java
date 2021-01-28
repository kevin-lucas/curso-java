/*
 * Curso Java XTI
 * Aula 041
 * Variáveis e Métodos Estáticos
 */
package br.com.xti.aula041.variaveis_metodos_estaticos;

/**
 *
 * @author Kevin Lucas
 */
public class GalinhaTest {

    public static void main(String[] args) {

        // Criando uma Galinha
        Galinha carijo = new Galinha();
        // Bota os ovos dessa galinha carijo
        carijo.botar().botar().botar().botar();
        System.out.println(carijo.ovos);

        // Cria outra galinha
        Galinha pintadinha = new Galinha();
        // Bota os ovos dessa galinha
        pintadinha.botar().botar();
        // Exibe os ovos da galinha 
        System.out.println(pintadinha.ovos);

        // Exibe os ovos da granja 
        System.out.println(Galinha.ovosDaGranja);
        
        // Informa a media de ovos da granja
        System.out.println(Galinha.mediaOvos(Galinha.contator));
    }
}
