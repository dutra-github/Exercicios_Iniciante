package exercicios.praticos.orientado.a.objetos.testes;

import java.util.Scanner;

public class CalculadoraTesteMain02 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        double x, y; // primeiro número e segundo número
        double soma, subt, div, mult; // operações

        System.out.print("Digite o primeiro número: " );
        x = input.nextInt();

        System.out.print("Digite o segundo número: " );
        y = input.nextInt();

        soma = x + y;
        subt = x - y;
        div = x / y;
        mult = x * y;

        System.out.println("A soma é: " + soma);
        System.out.println("A subtração é: " + subt);
        System.out.println("A divisão é: " + div);
        System.out.println("A multiplicação é: " + mult);
    }
}
