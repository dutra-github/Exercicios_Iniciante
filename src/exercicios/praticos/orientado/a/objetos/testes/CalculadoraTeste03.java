package exercicios.praticos.orientado.a.objetos.testes;

import com.sun.source.tree.CaseTree;
import exercicios.praticos.orientado.a.objetos.dominio.Calculadora2;

import java.util.Scanner;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora2 calculadora2 = new Calculadora2();
        Scanner input = new Scanner(System.in);

        System.out.print("1 - Adição\n2 - Subtração\n3 - Divisão\n4 - multiplicação\nDigite a opção correspondente para efetuar a operação: ");
        calculadora2.setOperador(input.nextInt());
        if (calculadora2.getOperador() == 0 || calculadora2.getOperador() > 4) {
            System.out.println("Opção de operação é Inválida. Tente novamente!!!");
            return;
        } else {
            System.out.print("Digite o primero Número: ");
            calculadora2.setNumber1(input.nextInt());

            System.out.print("Digite o segundo Número: ");
            calculadora2.setNumber2(input.nextInt());

            if (calculadora2.getOperador() == 1) {
                System.out.print("Resultado da soma dos dois números é : ");
                calculadora2.Soma();
            } else if (calculadora2.getOperador() == 2) {
                System.out.print("Resultado da subtração dos dois números é : ");
                calculadora2.subtracao();
            } else if (calculadora2.getOperador() == 3) {
                System.out.print("Resultado da divisão dos dois números é : ");
                calculadora2.divisao();
            } else {
                System.out.print("Resultado da multiplicação dos dois números é : ");
                calculadora2.multiplicacao();

            }

        }
    }
}
