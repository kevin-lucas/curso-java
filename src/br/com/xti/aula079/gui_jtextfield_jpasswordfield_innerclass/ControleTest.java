/*
 * Curso Java XTI
 * Aula 079
 * GUI, JTextField, JPasswordField e InnerClass
 */
package br.com.xti.aula079.gui_jtextfield_jpasswordfield_innerclass;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Kevin Lucas
 */
// Estende de Jframe e implementa ActionListener
public class ControleTest extends JFrame /*implements ActionListener */ {

    // Declaração dos labels
    JLabel textoUsuario;
    JLabel textoSenha;

    // Declaração dos campos 
    JTextField campoUsuario;
    JPasswordField campoSenha;

    // Declaração dos botoes
    JButton botaoConfirmar, botaoCancelar;

    // Construtor
    public ControleTest() {
        super("Textos e senhas");

        // Cria os labels
        textoUsuario = new JLabel("Usuário:");
        textoSenha = new JLabel("Senha:");

        // Cria os campos
        campoUsuario = new JTextField();
        campoSenha = new JPasswordField();

        // Cria os botoes
        botaoConfirmar = new JButton("Confirmar");
        botaoCancelar = new JButton("Cancelar");

        // Adiciona o metodo ouvite aos botoes
        //botaoConfirmar.addActionListener(this);
        //botaoCancelar.addActionListener(this);
        // Adicionando as classe responsaveis por escutar os eventos
        botaoConfirmar.addActionListener(new BotaoConfirmarListener());
        botaoCancelar.addActionListener(new BotaoCancelarListener());
        // Container padrao
        Container janela = getContentPane();
        // Define layout GridLayout
        janela.setLayout(new GridLayout(3, 2));
        // Criando o formulario
        // Texto do usuário
        janela.add(textoUsuario);
        // Compo do usuário
        janela.add(campoUsuario);
        // Texto da senha
        janela.add(textoSenha);
        // Campos da senha
        janela.add(campoSenha);
        janela.add(botaoConfirmar);
        //Adiciona os botoes
        // Botao confima
        janela.add(botaoCancelar);
        // Dimensoes
        setSize(300, 300);
        //Operacao padrao de fechamento
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Visibilidade da janela
        setVisible(true);
    }

    public static void main(String[] args) {
        new ControleTest();
    }

    // Inner class é separar as funcionalidades deixando o codigo mais organizado
    // Aplicando a Inner Class
    // Criando uma forma melhor para tratar os eventos dos botoes
    // Criando uma classe para tratar o evento do botao confirmar
    class BotaoConfirmarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Recupera o objeto que deu origem ao evento.
            if (e.getSource() == botaoConfirmar) {

                String mensagem = "Usuário: " + campoUsuario.getText()
                        + " \nSenha: " + new String(campoSenha.getPassword());
                JOptionPane.showMessageDialog(null, mensagem);

                // Exibe uma mensagem
                //System.out.println("Clicou em confirmar!");
            }
        }
    }

    // Criando uma forma melhor para tratar os eventos dos botoes
    // Criando uma classe para tratar o evento do botao confirmar
    class BotaoCancelarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Recupera o objeto que deu origem ao evento.
            if (e.getSource() == botaoCancelar) {
                campoUsuario.setText("");
                campoSenha.setText("");
            }
        }
    }

    /* Forma mais simples de tratar os eventos 
        // Evento que ira tratar o clique dos botoes
        @Override
        public void actionPerformed(ActionEvent e) {
            // Recupera o objeto que deu origem ao evento.
            if (e.getSource() == botaoConfirmar) {

                String mensagem = "Usuário: " + campoUsuario.getText()
                        + " \nSenha: " + new String(campoSenha.getPassword());
                JOptionPane.showMessageDialog(null, mensagem);

                // Exibe uma mensagem
                //System.out.println("Clicou em confirmar!");
            } else if (e.getSource() == botaoCancelar) {
                campoUsuario.setText("");
                campoSenha.setText("");
                //System.out.println("Clicou em cancelar!");
            }
            // Exibe uma mensagem
            //System.out.println("Clicou!");
        }
     */
}
