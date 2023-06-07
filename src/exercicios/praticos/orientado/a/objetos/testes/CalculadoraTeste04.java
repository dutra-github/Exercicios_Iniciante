package exercicios.praticos.orientado.a.objetos.testes;

import exercicios.praticos.orientado.a.objetos.dominio.Calculadora2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora2 calculadora2 = new Calculadora2();
        Scanner input = new Scanner(System.in);


        System.out.println("1-Adição 2-Subtração 3-Divisão 4-multiplicação ");
        System.out.print("Digite o tipo de operação --> ");


        calculadora2.setOperador(input.nextInt());


        if (calculadora2.getOperador() == 1) {
            System.out.println("VOCÊ ESCOLHEU ADIÇÃO");
        } else if (calculadora2.getOperador() == 2) {
            System.out.println("VOCÊ ESCOLHEU SUBTRAÇÃO");
        } else if (calculadora2.getOperador() == 3) {
            System.out.println("VOCÊ ESCOLHEU DIVISÃO");
        } else if ((calculadora2.getOperador() == 4)) {
            System.out.println("VOCÊ ESCOLHEU MULTIPLICAÇÃO");
        } else {
            do {
                System.out.println("Opção Incorreta. Tente Novamente");
                calculadora2.setOperador(input.nextInt());
            } while (calculadora2.getOperador() == 0 || calculadora2.getOperador() > 4);
        }


        System.out.print("Digite o primero Número: ");
        calculadora2.setNumber1(input.nextDouble());

        System.out.print("Digite o segundo Número: ");
        calculadora2.setNumber2(input.nextDouble());

        if (calculadora2.getOperador() == 1) {
            System.out.print("Resultado da soma dos dois números é : ");
            calculadora2.Soma();
            return;
        } else if (calculadora2.getOperador() == 2) {
            System.out.print("Resultado da subtração dos dois números é : ");
            calculadora2.subtracao();
            return;
        } else if (calculadora2.getOperador() == 3) {
            calculadora2.divisao();
            return;
        } else {
            System.out.println("Resultado da multiplicação dos dois números é : ");
            calculadora2.multiplicacao();
            return;

        }


    }

}

