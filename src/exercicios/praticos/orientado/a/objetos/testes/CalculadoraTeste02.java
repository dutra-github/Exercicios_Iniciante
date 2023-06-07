package exercicios.praticos.orientado.a.objetos.testes;

import exercicios.praticos.orientado.a.objetos.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.print("Digite o primeiro número: ");
        calculadora.number1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        calculadora.number2 = input.nextDouble();

        calculadora.sum = calculadora.number1 + calculadora.number2;
        calculadora.sub = calculadora.number1 - calculadora.number2;
        calculadora.div = calculadora.number1 / calculadora.number2;
        calculadora.mult = calculadora.number1 * calculadora.number2;

        System.out.println("O resultado da Soma dos 2 números é  : " + calculadora.sum);// exibe o resultado da soma
        System.out.println("O resultado da Subtração dos 2 números é  : " + calculadora.sub);// exibe o resultado da soma
        System.out.println("O resultado da Divisão dos 2 números é  : " + calculadora.div);// exibe o resultado da soma
        System.out.println("O resultado da Multiplicação dos 2 números é  : " + calculadora.mult);// exibe o resultado da soma

    }

}
