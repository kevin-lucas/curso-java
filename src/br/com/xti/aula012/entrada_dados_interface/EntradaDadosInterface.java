/**
 * Curso de Java XTI
 * Aula 012
 * Entrada de Dados Interface
 */
package br.com.xti.aula012.entrada_dados_interface;

// Importando a class JOptionPane
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Lucas
 *
 */
public class EntradaDadosInterface {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Captura a informação passada pelo usuário
        String nome = JOptionPane.showInputDialog("Informe seu nome:");
        // System.out.println(nome);

        // Exibe a informação
        JOptionPane.showMessageDialog(null, nome);

    }

}
