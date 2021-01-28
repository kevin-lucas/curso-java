/*
 * Curso Java XTI
 * Aula 077
 * GUI, Evetos, Listeners
 */
package br.com.xti.aula077.gui_eventos_listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Lucas
 */
// Classe estende de JFrame e implementa ActionListener para que a classe seja uma ouvinte.
public class Eventos extends JFrame implements ActionListener {

    JButton botao;

    public Eventos() {

        // Cria uma botao
        botao = new JButton("Clique!");
        // Adiciona o ouvinte (classe) ao botao
        botao.addActionListener(this);
        // Adiciona o botao a janela
        getContentPane().add(botao);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Exibe a mensagem quando o botao é clicado
        JOptionPane.showMessageDialog(this, "Ouvi, Botão clicado!");
    }

    public static void main(String[] args) {
        new Eventos();
    }
}
