/*
 * Curso Java XTI
 * Aula 074
 * GUI, BorderLayout e FlowLayout
 */
package br.com.xti.aula075.gui_borderlayout_flowlayout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Kevin Lucas
 */
public class Layouts extends JFrame {

    public Layouts() {
        super("Layouts");
        // Represeta a janela criada e armazena no container
        Container janela = getContentPane();

        /* Criando um layout */
        /* Cria um layout do tipo BorderLayout que é o layout padrão */
        BorderLayout borderLayout = new BorderLayout();
        // Atribui o layout criado a janela
        janela.setLayout(borderLayout);

        // Adicionandos botoes ao layout em posicoes diferentes do layout
        // Cria uma botão na parte superior (norte)
        janela.add(BorderLayout.NORTH, new JButton("Norte"));

        // Cria uma botão na parte inferior (sul)
        janela.add(BorderLayout.SOUTH, new JButton("Sul"));

        // Cria uma botão na parte central (centro)
        janela.add(BorderLayout.CENTER, new JButton("Centro"));

        // Cria uma botão na parte direita (leste)
        janela.add(BorderLayout.EAST, new JButton("Leste"));

        // Cria uma botão na parte esquerda (oeste)
        janela.add(BorderLayout.WEST, new JButton("Oeste"));

        /* Cria uma layout do tipo FlowLayout */
        FlowLayout flowLayout = new FlowLayout();
        
        janela.setLayout(flowLayout);
        
        //Metodos padroes da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Layouts();
    }
}
