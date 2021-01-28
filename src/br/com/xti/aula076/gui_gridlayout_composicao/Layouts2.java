/*
 * Curso Java XTI
 * Aula 074
 * GUI, GridLayout Composição
 */
package br.com.xti.aula076.gui_gridlayout_composicao;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Kevin Lucas
 */
public class Layouts2 extends JFrame {

    public Layouts2() {
        super("Layouts 2");

        /*
        // Cria um container, layout padrao BoderLayout
        Container janela = getContentPane();

        // Atribui um layout com espacamento
        janela.setLayout(new BorderLayout(15, 15));
    
        // Cria botoes em determinadas regioes
        janela.add(BorderLayout.NORTH, new JButton("Norte"));
        janela.add(BorderLayout.SOUTH, new JButton("Sul"));
        janela.add(BorderLayout.CENTER, new JButton("Centro"));
        janela.add(BorderLayout.EAST, new JButton("Leste"));
        janela.add(BorderLayout.WEST, new JButton("Oeste"));
         */
        /* 
        // Cria um layout GridLayout
        // Atribuir um layout definindo a quantidade de linha e colunas
        janela.setLayout(new GridLayout(2, 3));
        janela.add(new JButton("1"));
        janela.add(new JButton("2"));
        janela.add(new JButton("3"));
        janela.add(new JButton("4"));
        janela.add(new JButton("5"));
         */
        /* Composição de Layout */
        // Cria um container com layout padrao
        Container layoutBorderLayout = getContentPane();
        // Atribui o layout 
        layoutBorderLayout.setLayout(new BorderLayout());

        // Cria uma painel
        Container layoutGridLayout = new Panel();
        layoutGridLayout.setLayout(new GridLayout(4, 1));
        layoutGridLayout.add(new JButton("Ok"));
        layoutGridLayout.add(new JButton("Cancel"));
        layoutGridLayout.add(new JButton("Setup"));
        layoutGridLayout.add(new JButton("Help"));

        layoutBorderLayout.add(BorderLayout.CENTER, new JButton("Centro"));
        layoutBorderLayout.add(BorderLayout.EAST, layoutGridLayout);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Layouts2();
    }
}
