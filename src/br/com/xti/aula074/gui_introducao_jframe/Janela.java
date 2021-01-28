/*
 * Curso Java XTI
 * Aula 074
 * GUI, Introdução ao JFrame
 */
package br.com.xti.aula074.gui_introducao_jframe;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Kevin Lucas
 */
// Ao estender da Janela a classe Janela se torna um JFrame
public class Janela extends JFrame {

    // Construtor da Janela
    public Janela() {
        // Utiliza o construtor do JFrame
        super("Janela");

        // Criação de um botão
        JButton botao = new JButton("OK");

        // Adicionar botão a Janela
        getContentPane().add(botao);

        // Define uma operação padrao para a janela ao ser fechada
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Define uma largura e tamanho da janela
        setSize(300, 300);

        // Exibe a janela ao ser excutado
        setVisible(true);
    }

    public static void main(String[] args) {
        // Instancia a janela
        new Janela();
    }
}
