package exercicios.praticos.orientado.a.objetos.testes;

import java.util.Scanner;

public class CalculadoraTesteMain {

    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        double number1;
        double number2;

        System.out.print("Digite o primeiro número: ");
        number1 = numeros.nextInt();

        System.out.print("Digite o segundo número: ");
        number2 = numeros.nextInt();

        double sum = number1 + number2;
        double sub = number1 - number2;
        double div = number1 / number2;
        double mult = number1 * number2;

        System.out.println("O Primeiro Numero  é  : " + number1);// exibe o resultado da soma
        System.out.println("O Segundo  Numero  é  : " + number2);// exibe o resultado da soma
        System.out.println("O resultado da Soma dos 2 números é  : " + sum);// exibe o resultado da soma
        System.out.println("O resultado da Subtração dos 2 números é  : " + sub);// exibe o resultado da soma
        System.out.println("O resultado da Divisão dos 2 números é  : " + div);// exibe o resultado da soma
        System.out.println("O resultado da Multiplicação dos 2 números é  : " + mult);// exibe o resultado da soma
    }

}

