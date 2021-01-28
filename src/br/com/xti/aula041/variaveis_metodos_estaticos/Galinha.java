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
public class Galinha {

    // Informa a quantidade de galinha foram criadas
    static int contator = 0;

    public Galinha() {
        contator++;
    }

    /* As variáveis estáticas são variaveis globais acessadas pela classe, isto 
    significa que variável pertece a classe e não ao objeto.
     */
    // Criando um variável estática
    // Represeta os ovos da granja
    protected static int ovosDaGranja;

    // Variável que represeta os ovos da galinha
    protected int ovos;

    // Metodo que faz a galinha botar
    public Galinha botar() {
        this.ovos++;
        Galinha.ovosDaGranja++;
        return this; // permite que o metodo seja chamado varias vezes 
    }

    // Metodo para exibir a media dos ovos da granja
    public static double mediaOvos(int numGalinhas) {
        //Não é possivel utilizar atributos do objeto, apenas atributos estaticos.
        //this.ovos;
        return Galinha.ovosDaGranja / numGalinhas;
    }

}
