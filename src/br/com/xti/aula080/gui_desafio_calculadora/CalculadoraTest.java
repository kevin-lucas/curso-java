/*
 * Curso Java XTI
 * Aula 081
 * GUI, Desafio Calculadora
 */
package br.com.xti.aula080.gui_desafio_calculadora;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Kevin Lucas
 */
public class CalculadoraTest extends JFrame {

    public CalculadoraTest() {
        super("Calculadora");
        Container layout1 = getContentPane();
        Container layout2 = new JPanel();
        layout1.setLayout(new BorderLayout());
        JTextField numero = new JTextField();
        numero.setFont(new Font("serif", Font.PLAIN, 26));
        layout1.add(BorderLayout.NORTH, numero);
        layout2.setLayout(new GridLayout(4, 4, 5, 5));
        layout2.add(new JButton("7"));
        layout2.add(new JButton("8"));
        layout2.add(new JButton("9"));
        layout2.add(new JButton("/"));
        layout2.add(new JButton("4"));
        layout2.add(new JButton("5"));
        layout2.add(new JButton("6"));
        layout2.add(new JButton("*"));
        layout2.add(new JButton("1"));
        layout2.add(new JButton("2"));
        layout2.add(new JButton("3"));
        layout2.add(new JButton("-"));
        layout2.add(new JButton("0"));
        layout2.add(new JButton("."));
        layout2.add(new JButton("="));
        layout2.add(new JButton("+"));
        layout1.add(BorderLayout.CENTER, layout2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculadoraTest();
    }

}
