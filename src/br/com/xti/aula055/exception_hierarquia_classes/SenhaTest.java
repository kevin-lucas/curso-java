/*
 * Curso Java XTI
 * Aula 055
 * Execption Hierarquia de Classes
 */
package br.com.xti.aula055.exception_hierarquia_classes;

/**
 *
 * @author Kevin Lucas
 */
public class SenhaTest {

    // criando um metodo para autenticar a senha
    static void autenticar(String senha) throws SenhaInvalidaExeption {
        if ("123".equals(senha)) {
            System.out.println("Autenticado");
        } else {
            // caso a senha seja incorreta lança a exeção e exibe o erro
            throw new SenhaInvalidaExeption("Senha Inválida!");
        }
    }

    public static void main(String[] args) {
        try {
            autenticar("123");
        } catch (SenhaInvalidaExeption senhaInvalidaExeption) {
            senhaInvalidaExeption.printStackTrace();
            System.out.println(senhaInvalidaExeption.getMessage());
        }
    }
}
