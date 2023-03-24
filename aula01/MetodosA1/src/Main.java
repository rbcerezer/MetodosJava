import edu.dio.metodosjava.Calculadora;
import edu.dio.metodosjava.Emprestimo;
import edu.dio.metodosjava.Saudacao;

public class Main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(5, 15);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(10, 2.5);

        // Mensagem
        System.out.println("Exercício mensagem");
        Saudacao.obterSaudacao(17);
        Saudacao.obterSaudacao(2);
        Saudacao.obterSaudacao(9);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
    }
