package exercicios.praticos.orientado.a.objetos.testes;

import exercicios.praticos.orientado.a.objetos.dominio.Calculadora2;

import java.util.Scanner;

public class CalculadoraTeste06 {
    public static void main(String[] args) {
        Calculadora2 calculadora2 = new Calculadora2();
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("1-Adição 2-Subtração 3-Divisão 4-multiplicação ");
            System.out.print("Digite o tipo de operação --> ");
            calculadora2.setOperador(input.nextInt());

                switch (calculadora2.getOperador()) {
                    case 1:
                        System.out.println("VOCÊ ESCOLHEU ADIÇÃO");
                        break;
                    case 2:
                        System.out.println("VOCÊ ESCOLHEU SUBTRAÇÃO");
                        break;
                    case 3:
                        System.out.println("VOCÊ ESCOLHEU DIVISÃO");
                        calculadora2.desejaContinuar();
                        break;
                    case 4:
                        System.out.println("VOCÊ ESCOLHEU MULTIPLICAÇÃO");
                        break;
                    default:

                        System.out.println("Opção Incorreta. Tente Novamente");
                        System.out.print("Digite o tipo de operação --> ");
                        calculadora2.setOperador(input.nextInt());
                }


            System.out.print("Digite o primero Número: ");
            calculadora2.setNumber1(input.nextDouble());

            System.out.print("Digite o segundo Número: ");
            calculadora2.setNumber2(input.nextDouble());

            do {
                switch (calculadora2.getOperador()) {
                    case 1:
                        System.out.print("Resultado da soma dos dois números é : ");
                        calculadora2.Soma();
                        break;
                    case 2:
                        System.out.print("Resultado da subtração dos dois números é : ");
                        calculadora2.subtracao();
                        break;
                    case 3:
                        System.out.print("Resultado da divisão dos dois números é : ");
                        calculadora2.divisao();
                        calculadora2.desejaContinuar();
                        break;
                    case 4:
                        System.out.print("Resultado da multiplicação dos dois números é : ");
                        calculadora2.multiplicacao();
                        break;

                }
            } while (calculadora2.getOperador() > 0 && calculadora2.getOperador() < 5);
            calculadora2.desejaContinuar();




        } while (calculadora2.getContinua() == 1);
    }
}



















